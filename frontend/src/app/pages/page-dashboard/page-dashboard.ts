import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MenuComponent } from '../../composants/menu/menu';
import { Header } from 'src/app/composants/header/header';
@Component({
  selector: 'app-page-dashboard',
  standalone: true,
  imports: [MenuComponent, RouterOutlet,Header],
  templateUrl: './page-dashboard.html',
  styleUrl: './page-dashboard.scss',
})
export class PageDashboard {}
