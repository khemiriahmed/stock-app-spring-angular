import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MenuComponent } from '../../composants/menu/menu';
@Component({
  selector: 'app-page-dashboard',
  standalone: true,
  imports: [MenuComponent, RouterOutlet],
  templateUrl: './page-dashboard.html',
  styleUrl: './page-dashboard.scss',
})
export class PageDashboard {}
