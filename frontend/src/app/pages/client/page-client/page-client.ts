import { Component } from '@angular/core';
import { ButtonAction } from 'src/app/composants/button-action/button-action';
import { DetailCltFrs } from 'src/app/composants/detail-clt-frs/detail-clt-frs';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-client',
  imports: [DetailCltFrs,Pagination,ButtonAction],
  templateUrl: './page-client.html',
  styleUrl: './page-client.scss',
})
export class PageClient {

}
