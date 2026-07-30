import { Component } from '@angular/core';
import {Router} from '@angular/router';
import { ButtonAction } from 'src/app/composants/button-action/button-action';
import { DetailArticle } from 'src/app/composants/detail-article/detail-article';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-article',
  imports: [DetailArticle,Pagination,ButtonAction],
  templateUrl: './page-article.html',
  styleUrl: './page-article.scss',
})
export class PageArticle {


    constructor(
    private router: Router,
  ) { }

    ngOnInit(): void {
    //this.findListArticle();
  }
  
    nouvelArticle(): void {
    this.router.navigate(['nouvelarticle']);
  }

}