import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { DetailCmd } from '../detail-cmd/detail-cmd';

@Component({
  selector: 'app-nouvelle-cmd-clt-frs',
  imports: [DetailCmd],
  templateUrl: './nouvelle-cmd-clt-frs.html',
  styleUrl: './nouvelle-cmd-clt-frs.scss',
})
export class NouvelleCmdCltFrs implements OnInit {
  origin = '';

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
  ) { }


  
  ngOnInit(): void {
    this.activatedRoute.data.subscribe(data => {
      this.origin = data[origin];
    });
   // this.findAllClientsFournisseurs();
    //this.findAllArticles();
  }

}
