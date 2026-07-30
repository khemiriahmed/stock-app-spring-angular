import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageLoginComponent } from './pages/page-login/page-login.component';
import { PageInscription } from './pages/page-inscription/page-inscription';
import { PageDashboard } from './pages/page-dashboard/page-dashboard';
import { PageStatistique } from './pages/page-statistique/page-statistique';
import { PageArticle } from './pages/articles/page-article/page-article';
import { NouvelArticle } from './pages/articles/nouvel-article/nouvel-article';
import { PageMvtstk } from './pages/mvtstk/page-mvtstk/page-mvtstk';
import { PageClient } from './pages/client/page-client/page-client';
import { PageFournisseur } from './pages/fournisseur/page-fournisseur/page-fournisseur';
import { NouveauCltFrs } from './composants/nouveau-clt-frs/nouveau-clt-frs';
import { PageCmdCltFrs } from './pages/page-cmd-clt-frs/page-cmd-clt-frs';
import { NouvelleCmdCltFrs } from './composants/nouvelle-cmd-clt-frs/nouvelle-cmd-clt-frs';
import { NouvelleCategory } from './pages/categories/nouvelle-category/nouvelle-category';
import { PageCategories } from './pages/categories/page-categories/page-categories';
import { PageUtilisateur } from './pages/utilisateur/page-utilisateur/page-utilisateur';
import { NouvelUtlisateur } from './pages/utilisateur/nouvel-utlisateur/nouvel-utlisateur';
import { PageProfile } from './pages/profile/page-profile/page-profile';
import { ChangerMotDePass } from './pages/profile/changer-mot-de-pass/changer-mot-de-pass';

export const routes: Routes = [
  {
    path: 'login',
    component: PageLoginComponent,
  },
  {
    path: 'inscrire',
    component: PageInscription,
  },
  {
    path: '',
    component: PageDashboard,

    children: [
      {
        path: 'statistiques',
        component: PageStatistique,
      },
      {
        path: 'articles',
        component: PageArticle,
      },

      {
        path: 'nouvelarticle',
        component: NouvelArticle,
      },

      {
        path: 'mvtstk',
        component: PageMvtstk,
      },

      {
        path: 'clients',
        component: PageClient,
      },

      {
        path: 'nouveauclient',
        component: NouveauCltFrs,
      },

      {
        path: 'commandesclient',
        component: PageCmdCltFrs,
        data: {
          origin: 'client'
        }
      },

      {
        path: 'nouvellecommandeclt',
        component: NouvelleCmdCltFrs,
          data: {
          origin: 'client'
        }
      },

      {
        path: 'fournisseurs',
        component: PageFournisseur,
         
      },

      {
        path: 'nouveaufournisseur',
        component: NouveauCltFrs,
         data: {
          origin: 'fournisseur'
        }
      },

      {
        path: 'commandesfournisseur',
        component: PageCmdCltFrs,
         data: {
          origin: 'fournisseur'
        }
      },

      {
        path: 'nouvellecommandefrs',
        component: NouvelleCmdCltFrs,
      },

      {
        path: 'categories',
        component: PageCategories,
      },

      {
        path: 'nouvellecategorie',
        component: NouvelleCategory,
      },

      {
        path: 'utilisateurs',
        component: PageUtilisateur,
      },

      {
        path: 'nouvelutilisateur',
        component: NouvelUtlisateur,
      },

      {
        path: 'profil',
        component: PageProfile,
      },

      {
        path: 'changermotdepasse',
        component: ChangerMotDePass,
      },

    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
