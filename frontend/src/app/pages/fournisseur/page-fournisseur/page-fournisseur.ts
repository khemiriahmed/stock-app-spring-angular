import { Component } from '@angular/core';
import { ButtonAction } from 'src/app/composants/button-action/button-action';
import { DetailCltFrs } from 'src/app/composants/detail-clt-frs/detail-clt-frs';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-fournisseur',
  imports: [DetailCltFrs, Pagination,ButtonAction],
  templateUrl: './page-fournisseur.html',
  styleUrl: './page-fournisseur.scss',
})
export class PageFournisseur {

}
