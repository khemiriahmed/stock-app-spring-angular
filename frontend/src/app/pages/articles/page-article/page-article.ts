import { Component } from '@angular/core';
import { DetailArticle } from 'src/app/composants/detail-article/detail-article';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-article',
  imports: [DetailArticle,Pagination],
  templateUrl: './page-article.html',
  styleUrl: './page-article.scss',
})
export class PageArticle {

}
