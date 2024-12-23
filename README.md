# Pokemon API

Aplicación para consultar información de Pokémon y gestionar entrenadores.

---
## Tecnologías Utilizadas

- **Frontend:**
  - Thymeleaf
- **Backend:**
  - Java 17
  - Spring boot
- **Base de datos:**
    - Postgresql
---

## Configuración
1. Clonar el repositorio
```
git clone https://github.com/serand04/Pokemon_java.git
```
2. Configurar la base de datos
```
CREATE DATABASE pokemon_db;
CREATE USER pokemon_user WITH PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE pokemon_db TO pokemon_user;
```
3. Configurar application.properties 
```
spring.datasource.url=jdbc:postgresql://localhost:5432/pokemon_db
spring.datasource.username=pokemon_user
spring.datasource.password=password
```
4. Ejecutar la aplicación
```
mvn spring-boot:run
```

## Contribución

¡Contribuciones son bienvenidas! Si encuentras algún problema o tienes una sugerencia, por favor, crea un nuevo issue o envia un pull request

## Licencia

Este proyecto está bajo la licencia MIT

## Autor
Desarrollado por Sergio Cruz

---

Este archivo explica el propósito, las tecnologías, las instrucciones de instalación, además de detallar las funcionalidades del sistema. Si necesitas agregar algo más, házmelo saber.