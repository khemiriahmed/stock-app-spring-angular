/* tslint:disable */
import { Injectable } from '@angular/core';

/**
 * Global configuration for Api services
 */
@Injectable({
  providedIn: 'root',
})
export class ApiConfiguration {
  // URL relative : les appels passent par le meme origine (reverse proxy nginx
  // en Docker, ou proxy de developpement via proxy.conf.json en local).
  rootUrl: string = '';
}

export interface ApiConfigurationInterface {
  rootUrl?: string;
}
