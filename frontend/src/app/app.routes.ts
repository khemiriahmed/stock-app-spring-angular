import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageLoginComponent } from './pages/page-login/page-login.component';
import { PageInscription } from './pages/page-inscription/page-inscription';
import { PageDashboard } from './pages/page-dashboard/page-dashboard';
import { PageStatistique } from './pages/page-statistique/page-statistique';
import { PageArticle } from './pages/articles/page-article/page-article';

export const routes: Routes = [
  {
    path:'login',
    component: PageLoginComponent 
  },
  {
    path: 'inscrire',
    component: PageInscription
  },
  {
    path: '',
    component: PageDashboard,

     children: [
       {
        path:'statistiques',
        component: PageStatistique
       },
       {
        path:'articles',
        component: PageArticle
       }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
