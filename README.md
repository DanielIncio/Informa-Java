# Informa-Java

API REST del sistema **Informa** para administrar el maestro de artículos y sus catálogos relacionados (tipos de producto, familias, clases, unidades de medida, almacenes, transportistas, vendedores y más). Hecha con Spring Boot y MySQL.

> Frontend de este proyecto: [Informa](https://github.com/DanielIncio/Informa) (Angular)

## Tecnologías

- Java 17
- Spring Boot 3.3.0 (Spring Web, Spring Data JPA)
- MySQL (driver `mysql-connector-j`)
- Lombok
- Maven
- Postman (pruebas)

## Funcionalidades

- CRUD completo para **10 entidades** (cada una con su propio controller, service y repository)
- Entidad `Articulo` con más de 170 campos y relaciones `@ManyToOne` hacia tipo de producto, familia y clase
- Las tablas se crean automáticamente con Hibernate (`ddl-auto=update`)
- CORS habilitado para el frontend en `http://localhost:4200`

## Entidades

| Entidad | Endpoint base | Descripción |
|---|---|---|
| `Articulo` | `/api/articulo` | Maestro de artículos (relacionado con tipo, familia y clase) |
| `Ccmtpt` | `/api/ccmtpt` | Tipos de producto |
| `Ccmfam` | `/api/ccmfam` | Familias |
| `Ccmcla` | `/api/ccmcla` | Clases |
| `Inmuni` | `/api/inmuni` | Unidades de medida |
| `Ccmalm` | `/api/ccmalm` | Almacenes |
| `Ccmtrs` | `/api/ccmtrs` | Transportistas |
| `Ccmven` | `/api/ccmven` | Vendedores |
| `Ccmtip` | `/api/ccmtip` | Tipos de transacción |
| `Cpmcos` | `/api/cpmcos` | Costo de producción |

## Endpoints

Todas las entidades siguen el mismo patrón. Ejemplo con artículos:

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/api/articulo` | Listar todos los artículos |
| POST | `/api/articulo` | Crear un artículo (el JSON va en el body) |
| PUT | `/api/articulo` | Modificar un artículo (el código va dentro del body) |
| DELETE | `/api/articulo/{mcodart}` | Eliminar un artículo por su código |

### Ejemplo: crear un artículo con sus relaciones

```json
POST /api/articulo
{
  "mcodart": "A001",
  "mdescrip": "Artículo de ejemplo",
  "mabrevi": "ART EJ",
  "munidad": "UND",
  "ccmtpt": { "mcodtpt": "01" },
  "ccmfam": { "mcodfam": "01" },
  "ccmcla": { "mcodcla": "01" }
}
```

Las relaciones se envían solo con su código; el tipo, la familia y la clase deben existir antes.

## Cómo ejecutarlo

### Requisitos

- Java 17 o superior
- Maven
- MySQL

### Pasos

1. Clona el repositorio:
   ```bash
   git clone https://github.com/DanielIncio/Informa-Java.git
   cd Informa-Java/demo
   ```
2. Crea una base de datos vacía en MySQL (las tablas las crea Hibernate al iniciar):
   ```sql
   CREATE DATABASE iwb;
   ```
3. Copia el archivo de configuración de ejemplo y completa tus datos:
   ```bash
   cp src/main/resources/application.properties.example src/main/resources/application.properties
   ```
   Edita `application.properties` y cambia `TU_USUARIO` y `TU_PASSWORD` por tus credenciales de MySQL.
4. Ejecuta el proyecto:
   ```bash
   mvn spring-boot:run
   ```
   La API queda disponible en `http://localhost:9999`.

## Estructura del proyecto

```
demo/src/main/java/com/example/
├── controller/   → un controller por entidad (ArticuloController, CcmfamController, ...)
├── service/      → lógica de cada entidad
├── repository/   → interfaces JpaRepository
├── model/        → entidades JPA (Articulo, Ccmtpt, Ccmfam, Ccmcla, ...)
└── BasicApplication.java
```

## Próximas mejoras

- Login con JWT y roles (ya implementado en mis proyectos [clientes-api](https://github.com/DanielIncio/clientes-api) y veterinaria-api)
- Validaciones de entrada y manejo de errores centralizado con `@RestControllerAdvice`
- Respuestas con códigos HTTP correctos (404 si no existe, 409 si hay conflicto)

## Qué aprendí

- Arquitectura por capas (controller, service, repository)
- Relaciones entre entidades con JPA (`@ManyToOne` / `@JoinColumn`)
- Modelado de una tabla grande con muchos campos (`BigDecimal`, `Date`, `LocalDate`)
- Comunicación entre un backend Spring Boot y un frontend Angular (CORS)

## Autor

**Daniel Incio** · [GitHub](https://github.com/DanielIncio)
