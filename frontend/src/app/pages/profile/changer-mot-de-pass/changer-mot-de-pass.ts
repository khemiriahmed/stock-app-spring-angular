import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-changer-mot-de-pass',
  imports: [],
  templateUrl: './changer-mot-de-pass.html',
  styleUrl: './changer-mot-de-pass.scss',
})
export class ChangerMotDePass {


    constructor(
    private router: Router
  ) { }
  
  cancel(): void {
    this.router.navigate(['profil']);
  }

}
