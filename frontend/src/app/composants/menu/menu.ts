import { Component, OnInit } from '@angular/core';
import { Menu } from './menu-sidebar';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './menu.html',
  styleUrl: './menu.scss',
})
export class MenuComponent implements OnInit {
  public menuProperties: Array<Menu> = [
    {
      id: '1',
      titre: 'Tableau de bord',
      icon: 'fas fa-chart-line',
      url: '',
      open: true,
      sousMenu: [
        {
          id: '11',
          titre: "Vue d'ensemble",
          icon: 'fas fa-chart-pie',
          url: '',
        },
        {
          id: '12',
          titre: 'Statistiques',
          icon: 'fas fa-chart-bar',
          url: 'statistiques',
        },
      ],
    },

    {
      id: '2',
      titre: 'Articles',
      icon: 'fas fa-boxes-stacked',
      url: '',
      sousMenu: [
        {
          id: '21',
          titre: 'Articles',
          icon: 'fas fa-boxes-stacked',
          url: 'articles',
        },
        {
          id: '22',
          titre: 'Mouvements du stock',
          icon: 'fas fa-arrow-right-arrow-left',
          url: 'mvtstk',
        },
      ],
    },

    {
      id: '3',
      titre: 'Clients',
      icon: 'fas fa-user-group',
      url: '',
      sousMenu: [
        {
          id: '31',
          titre: 'Clients',
          icon: 'fas fa-users',
          url: 'clients',
        },
        {
          id: '32',
          titre: 'Commandes clients',
          icon: 'fas fa-basket-shopping',
          url: 'commandesclient',
        },
      ],
    },

    {
      id: '4',
      titre: 'Fournisseurs',
      icon: 'fas fa-truck-field',
      url: '',
      sousMenu: [
        {
          id: '41',
          titre: 'Fournisseurs',
          icon: 'fas fa-users',
          url: 'fournisseurs',
        },
        {
          id: '42',
          titre: 'Commandes fournisseurs',
          icon: 'fas fa-truck',
          url: 'commandesfournisseur',
        },
      ],
    },

    {
      id: '5',
      titre: 'Paramétrages',
      icon: 'fas fa-gear',
      url: '',
      sousMenu: [
        {
          id: '51',
          titre: 'Catégories',
          icon: 'fas fa-tags',
          url: 'categories',
        },
        {
          id: '52',
          titre: 'Utilisateurs',
          icon: 'fas fa-users-gear',
          url: 'utilisateurs',
        },
      ],
    },
  ];

  constructor(private router: Router) {}

  private lastSelectedMenu: Menu | undefined;

  ngOnInit(): void {}

  toggleGroupe(menu: Menu): void {
    menu.open = !menu.open;
  }

  navigate(menu: Menu): void {
    if (this.lastSelectedMenu) {
      this.lastSelectedMenu.active = false;
    }
    menu.open = true;
    menu.active = true;
    this.lastSelectedMenu = menu;
    this.router.navigate([menu.url]);
  }
}
