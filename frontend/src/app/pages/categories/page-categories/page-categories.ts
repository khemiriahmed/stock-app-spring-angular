import { Component } from '@angular/core';
import {Router} from '@angular/router';
import { ButtonAction } from 'src/app/composants/button-action/button-action';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-categories',
  imports: [Pagination,ButtonAction],
  templateUrl: './page-categories.html',
  styleUrl: './page-categories.scss',
})
export class PageCategories {
  constructor(
    private router: Router,
  ) { }

    nouvelleCategory(): void {
    this.router.navigate(['nouvellecategorie']);
  }
}
