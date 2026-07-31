import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-nouvel-utlisateur',
  imports: [],
  templateUrl: './nouvel-utlisateur.html',
  styleUrl: './nouvel-utlisateur.scss',
})
export class NouvelUtlisateur {

  constructor(
    private router: Router
  ) { }
  
  cancel(): void {
    this.router.navigate(['utilisateurs']);
  }

}
