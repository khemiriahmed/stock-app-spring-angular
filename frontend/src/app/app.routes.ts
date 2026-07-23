import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageLoginComponent } from './pages/page-login/page-login.component';
import { PageInscription } from './pages/page-inscription/page-inscription';
import { PageDashboard } from './pages/page-dashboard/page-dashboard';

export const routes: Routes = [
  {
    path:'login',
    component: PageLoginComponent 
  },
  {
    path: 'inscrire',
    component: PageInscription
  },
  // {
  //   path: '',
  //   component: PageDashboard,

  //    children: [
  //      {
  //       path:'articles'
  //      }
  //   ]
  // }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
