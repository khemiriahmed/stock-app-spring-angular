import { Component } from '@angular/core';
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

}
