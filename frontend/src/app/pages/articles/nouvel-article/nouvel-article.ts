import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-nouvel-article',
  imports: [],
  templateUrl: './nouvel-article.html',
  styleUrl: './nouvel-article.scss',
})
export class NouvelArticle {

    constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
  
  ) { }



  cancel(): void {
    this.router.navigate(['articles']);
  }
 
  enregistrerArticle() :void{

  }


}
