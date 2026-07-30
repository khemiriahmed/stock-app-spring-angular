import { Component } from '@angular/core';
import {Router} from '@angular/router';
import { ButtonAction } from 'src/app/composants/button-action/button-action';
import { DetailUtilisateur } from 'src/app/composants/detail-utilisateur/detail-utilisateur';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-utilisateur',
  imports: [ButtonAction,DetailUtilisateur,Pagination],
  templateUrl: './page-utilisateur.html',
  styleUrl: './page-utilisateur.scss',
})
export class PageUtilisateur {

    constructor(
    private router: Router
  ) { }

  ngOnInit(): void {
  }

  nouvelUtilsateur(): void {
    this.router.navigate(['nouvelutilisateur']);
  }

}
