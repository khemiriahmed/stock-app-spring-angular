package com.ahmedkh.stock_app.services.auth;

import com.ahmedkh.stock_app.model.Utilisateur;
import com.ahmedkh.stock_app.model.auth.ExtendedUser;
import com.ahmedkh.stock_app.repository.UtilisateurRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    private final UtilisateurRepository utilisateurRepository;

    public ApplicationUserDetailsService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Utilisateur utilisateur = utilisateurRepository
                .findUtilisateurByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                "Aucun utilisateur trouvé avec l'email : " + email));

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        utilisateur.getRoles().forEach(role ->
                authorities.add(new SimpleGrantedAuthority(role.getRoleName()))
        );

        return new ExtendedUser(
                utilisateur.getEmail(),
                utilisateur.getMoteDePasse(),
                utilisateur.getEntreprise().getId(),
                authorities
        );
    }
}