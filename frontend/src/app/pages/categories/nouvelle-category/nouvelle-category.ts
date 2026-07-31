import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-nouvelle-category',
  imports: [],
  templateUrl: './nouvelle-category.html',
  styleUrl: './nouvelle-category.scss',
})
export class NouvelleCategory {


  constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
  
  ) { }

  cancel(): void {
    this.router.navigate(['categories']);
  }
}
