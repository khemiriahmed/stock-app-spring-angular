# 📦 Stock Management - Spring Boot & Angular

<p align="center">
  <b>Application Full Stack de Gestion de Stock</b>
</p>
 
<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/Spring%20Security-6.x-blue?style=for-the-badge&logo=springsecurity" />
  <img src="https://img.shields.io/badge/Angular-20+-red?style=for-the-badge&logo=angular" />
  <img src="https://img.shields.io/badge/TypeScript-blue?style=for-the-badge&logo=typescript" />
  <img src="https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven" />
</p>

---

## Description

**Stock Management** est une application web Full Stack permettant de gérer
les différents aspects d'une activité commerciale et de suivre les stocks.

L'application est composée de deux parties :

text
Frontend
   │
   │ REST API
   ▼
Backend Spring Boot
   │
   ▼
Database


                        ┌──────────────────────┐
                        │       Angular        │
                        │      Frontend        │
                        └──────────┬───────────┘
                                   │
                                   │ HTTP / REST
                                   ▼
                        ┌──────────────────────┐
                        │     Spring Boot      │
                        │       Backend        │
                        └──────────┬───────────┘
                                   │
                 ┌─────────────────┼─────────────────┐
                 │                 │                 │
                 ▼                 ▼                 ▼
            Controllers        Services         Repositories
                 │                 │                 │
                 └─────────────────┼─────────────────┘
                                   │
                                   ▼
                            ┌─────────────┐
                            │   MySQL     │
                            │  Database   │
                            └─────────────┘


## Lancement avec Docker

La stack complète (MySQL + backend Spring Boot + frontend Angular/nginx)
se lance en une seule commande grâce à `docker-compose.yml`.

### Prérequis

- Docker Desktop (avec Docker Compose v2+)

### Démarrage


docker compose up -d --build


| Service  | URL depuis l'hôte     | Description                          |
|----------|-----------------------|--------------------------------------|
| Frontend | http://localhost:4201 | Application Angular servie par nginx  |
| Backend  | http://localhost:8081 | API REST Spring Boot (Swagger)        |
| MySQL    | localhost:3307        | Base `stock_db`                       |

> Le frontend appelle l'API via une URL **relative** (`/gestiondestock/...`).
> nginx joue le rôle de reverse-proxy vers le conteneur `backend`, ce qui évite
> tout problème de CORS et de port. Le backend n'est donc pas obligé d'être
> exposé : le port `8081` ne sert qu'au debug/Swagger.

### Ports personnalisés

Créez un fichier `.env` à la racine (à partir de `.env.example`) pour changer
les ports exposés sur l'hôte :

bash
cp .env.example .env


dotenv
MYSQL_PORT=3307
BACKEND_PORT=8081
FRONTEND_PORT=4201
MYSQL_DATABASE=stock_db
MYSQL_ROOT_PASSWORD=root

### Commandes utiles


docker compose ps                 # état des services
docker compose logs -f backend    # logs du backend
docker compose down               # arrêter
docker compose down -v            # arrêter + supprimer le volume MySQL



