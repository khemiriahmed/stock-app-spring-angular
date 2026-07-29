import { Component } from '@angular/core';
import { ButtonAction } from 'src/app/composants/button-action/button-action';
import { DetailMvtStkArticle } from 'src/app/composants/detail-mvt-stk-article/detail-mvt-stk-article';
import { DetailMvtStk } from 'src/app/composants/detail-mvt-stk/detail-mvt-stk';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-mvtstk',
  imports: [ButtonAction , DetailMvtStkArticle,Pagination,DetailMvtStk],
  templateUrl: './page-mvtstk.html',
  styleUrl: './page-mvtstk.scss',
})
export class PageMvtstk {

}
