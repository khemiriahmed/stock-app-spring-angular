import { Component,OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { ButtonAction } from 'src/app/composants/button-action/button-action';
import { DetailCmdCltFrs } from 'src/app/composants/detail-cmd-clt-frs/detail-cmd-clt-frs';
import { DetailCmd } from 'src/app/composants/detail-cmd/detail-cmd';
import { Pagination } from 'src/app/composants/pagination/pagination';

@Component({
  selector: 'app-page-cmd-clt-frs',
  imports: [Pagination,DetailCmd,DetailCmdCltFrs,ButtonAction],
  templateUrl: './page-cmd-clt-frs.html',
  styleUrl: './page-cmd-clt-frs.scss',
})
export class PageCmdCltFrs  implements OnInit  {
  origin = '';
   constructor(
    private router: Router,
        private activatedRoute: ActivatedRoute,

  ) { }
 ngOnInit(): void {
    this.activatedRoute.data.subscribe(data => {
      this.origin = data['origin'];
    });
   // this.findAllCommandes();
  }


   
  nouvelleCommande(): void {
    if (this.origin === 'client') {
      this.router.navigate(['nouvellecommandeclt']);
    } else if (this.origin === 'fournisseur') {
      this.router.navigate(['nouvellecommandefrs']);
    }
  }
}
