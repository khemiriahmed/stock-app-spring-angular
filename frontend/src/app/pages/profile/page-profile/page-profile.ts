import { Component } from '@angular/core';
import {Router} from '@angular/router';
@Component({
  selector: 'app-page-profile',
  imports: [],
  templateUrl: './page-profile.html',
  styleUrl: './page-profile.scss',
})
export class PageProfile {


  constructor(
    private router: Router
  ) { }

  ngOnInit(): void {
  }

  modifierMotDePasse(): void {
    this.router.navigate(['changermotdepasse']);
  }

}
