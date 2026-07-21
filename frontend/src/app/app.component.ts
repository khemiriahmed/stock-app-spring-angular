import { Component } from '@angular/core';
import { PageLoginComponent } from './pages/page-login/page-login.component';

@Component({
  selector: 'app-root',
   standalone: true,
  imports: [PageLoginComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'frontend';
}
