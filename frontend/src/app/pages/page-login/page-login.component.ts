import { Component,OnInit,inject   } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { RouterLink ,Router} from '@angular/router';
import { UserService } from '../../services/user/user';
import {AuthenticationRequest} from '../../../gs-api/src/models/authentication-request';
@Component({
  selector: 'app-page-login',
  standalone: true,
   imports: [RouterLink, FormsModule, CommonModule],
  templateUrl: './page-login.component.html',
  styleUrls: ['./page-login.component.scss']
})
export class PageLoginComponent implements OnInit {

    authenticationRequest: AuthenticationRequest = {};
    errorMessage = '';

  
     private userService = inject(UserService);
  private router = inject(Router);
  


    ngOnInit(): void {
  }

   login(): void {
    this.userService.login(this.authenticationRequest).subscribe({
      next: (data) => {
        this.userService.setAccessToken(data);
        this.getUserByEmail();
        this.router.navigate(['']);
      },
      error: () => {
        this.errorMessage = 'Login et / ou mot de passe incorrecte';
      }
    });
  }

   getUserByEmail(): void {
    this.userService.getUserByEmail(this.authenticationRequest.login)
      .subscribe({
        next: (user) => {
          this.userService.setConnectedUser(user);
        }
      });
  }

}
