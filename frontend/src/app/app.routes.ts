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
import { ApplicationGuardService } from './services/guard/application-guard';

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
        canActivate:[ApplicationGuardService]
      },
      {
        path: 'articles',
        component: PageArticle,
          canActivate:[ApplicationGuardService]
      },

      {
        path: 'nouvelarticle',
        component: NouvelArticle,
          canActivate:[ApplicationGuardService]
      },

      {
        path: 'mvtstk',
        component: PageMvtstk,
          canActivate:[ApplicationGuardService]
      },

      {
        path: 'clients',
        component: PageClient,
          canActivate:[ApplicationGuardService]
      },

      {
        path: 'nouveauclient',
        component: NouveauCltFrs,
          canActivate:[ApplicationGuardService]
      },

      {
        path: 'commandesclient',
        component: PageCmdCltFrs,
          canActivate:[ApplicationGuardService],
        data: {
          origin: 'client'
        }
      },

      {
        path: 'nouvellecommandeclt',
        component: NouvelleCmdCltFrs,
          canActivate:[ApplicationGuardService],
          data: {
          origin: 'client'
        }
      },

      {
        path: 'fournisseurs',
        component: PageFournisseur,
          canActivate:[ApplicationGuardService]
         
      },

      {
        path: 'nouveaufournisseur',
        component: NouveauCltFrs,
          canActivate:[ApplicationGuardService],
         data: {
          origin: 'fournisseur'
        }
      },

      {
        path: 'commandesfournisseur',
        component: PageCmdCltFrs,
          canActivate:[ApplicationGuardService],
         data: {
          origin: 'fournisseur'
        }
      },

      {
        path: 'nouvellecommandefrs',
        component: NouvelleCmdCltFrs,
          canActivate:[ApplicationGuardService],
      },

      {
        path: 'categories',
        component: PageCategories,
          canActivate:[ApplicationGuardService],
      },

      {
        path: 'nouvellecategorie',
        component: NouvelleCategory,
          canActivate:[ApplicationGuardService],
      },

      {
        path: 'utilisateurs',
        component: PageUtilisateur,
          canActivate:[ApplicationGuardService],
      },

      {
        path: 'nouvelutilisateur',
        component: NouvelUtlisateur,
          canActivate:[ApplicationGuardService],
      },

      {
        path: 'profil',
        component: PageProfile,
          canActivate:[ApplicationGuardService],
      },

      {
        path: 'changermotdepasse',
        component: ChangerMotDePass,
          canActivate:[ApplicationGuardService],
      },

    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
