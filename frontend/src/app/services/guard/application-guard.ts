import { Injectable, inject  } from '@angular/core';
import {UserService} from '../user/user';
import {Observable} from 'rxjs';
import {ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree} from '@angular/router';


    @Injectable({
  providedIn: 'root'
})


export class ApplicationGuardService implements CanActivate {
  


    private userService = inject(UserService);

 canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

     return this.userService.isUserLoggedAndAccessTokenValid();
  }
}
