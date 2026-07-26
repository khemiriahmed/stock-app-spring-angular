import { Component } from '@angular/core';
import { MenuComponent  } from '../../composants/menu/menu';
@Component({
  selector: 'app-page-dashboard',
    standalone: true,
 imports: [MenuComponent ],
  templateUrl: './page-dashboard.html',
  styleUrl: './page-dashboard.scss',
})
export class PageDashboard {

}
