package com.ahmedkh.stock_app.controller.api;

import com.ahmedkh.stock_app.dto.ArticleDto;
import com.ahmedkh.stock_app.dto.LigneCommandeClientDto;
import com.ahmedkh.stock_app.dto.LigneCommandeFournisseurDto;
import com.ahmedkh.stock_app.dto.LigneVenteDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static com.ahmedkh.stock_app.utils.Constants.APP_ROOT;

@Tag(name = "Article", description = APP_ROOT)
public interface ArticleApi {

    @PostMapping(value = APP_ROOT + "/article/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enregistrer un article", description = "Cette methode permet d'enregistrer ou modifier un article")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "L'objet article cree / modifie"),
            @ApiResponse(responseCode = "400", description = "L'objet article n'est pas valide")
    })
    ArticleDto save(@RequestBody ArticleDto dto);

    @GetMapping(value = APP_ROOT + "/article/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Rechercher un article par ID", description = "Cette methode permet de chercher un article par son ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "L'article a ete trouve dans la BDD"),
            @ApiResponse(responseCode = "404", description = "Aucun article n'existe dans la BDD avec l'ID fourni")
    })
    ArticleDto findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROOT + "/articles/filter/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "L'article a ete trouve dans la BDD"),
            @ApiResponse(responseCode = "404", description = "Aucun article n'existe dans la BDD avec le CODE fourni")
    })
    ArticleDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = APP_ROOT + "/articles/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Renvoi la liste des articles", description = "Cette methode permet de chercher et renvoyer la liste des articles qui existent dans la BDD")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La liste des article / Une liste vide")
    })
    List<ArticleDto> findAll();


    @GetMapping(value = APP_ROOT + "/articles/historique/vente/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") Integer idArticle);

    @GetMapping(value = APP_ROOT + "/articles/historique/commandeclient/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable("idArticle") Integer idArticle);

    @GetMapping(value = APP_ROOT + "/articles/historique/commandefournisseur/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") Integer idArticle);

    @GetMapping(value = APP_ROOT + "/articles/filter/category/{idCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> findAllArticleByIdCategory(@PathVariable("idCategory") Integer idCategory);


    @DeleteMapping(value = APP_ROOT + "/articles/delete/{idArticle}")
    @Operation(summary = "Supprimer un article", description = "Cette methode permet de supprimer un article par ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "L'article a ete supprime")
    })
    void delete(@PathVariable("idArticle") Integer id);
}