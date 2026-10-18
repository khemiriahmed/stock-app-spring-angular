import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { UtilisateurDto } from 'src/gs-api/src/models/utilisateur-dto';

@Component({
  selector: 'app-header',
  imports: [RouterLink, CommonModule],
  templateUrl: './header.html',
  styleUrl: './header.scss',
})
export class Header implements OnInit {
  connectedUser: UtilisateurDto = {};
  initiales = 'U';

  ngOnInit(): void {
    const raw = localStorage.getItem('connectedUser');
    if (raw) {
      try {
        this.connectedUser = JSON.parse(raw);
        const n = (this.connectedUser.nom || '').charAt(0);
        const p = (this.connectedUser.prenom || '').charAt(0);
        this.initiales = (n + p).toUpperCase() || 'U';
      } catch (e) {
        this.connectedUser = {};
      }
    }
  }
}
