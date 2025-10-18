# Productos - API REST con Spring Boot

Un proyecto escolar que implementa una API REST simple para gestionar productos usando Spring Boot y base de datos H2.

## Descripción

Esta aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre productos. Cada producto tiene:
- ID (generado automáticamente)
- Nombre
- Precio

## Requisitos

- Java 17 o superior
- Maven 3.6 o superior

## Pasos para ejecutar el proyecto

### 1. Clonar o descargar el proyecto
```bash
git clone https://github.com/fumelolz/productos
cd productos
```

### 2. Compilar el proyecto
```bash
./mvnw clean compile
```

### 3. Ejecutar la aplicación
```bash
./mvnw spring-boot:run
```

La aplicación se ejecutará en: `http://localhost:8080`

### 4. Probar la API

#### Obtener todos los productos
```bash
GET http://localhost:8080/api/productos
```

#### Crear un nuevo producto
```bash
POST http://localhost:8080/api/productos
Content-Type: application/json

{
    "nombre": "Laptop",
    "precio": 15000.50
}
```

#### Obtener un producto por ID
```bash
GET http://localhost:8080/api/productos/1
```

#### Actualizar un producto
```bash
PUT http://localhost:8080/api/productos/1
Content-Type: application/json

{
    "nombre": "Laptop Gaming",
    "precio": 18000.00
}
```

#### Eliminar un producto
```bash
DELETE http://localhost:8080/api/productos/1
```

## Herramientas para probar la API

Puedes usar cualquiera de estas herramientas:
- **Postman** - Interfaz gráfica fácil de usar
- **cURL** - Comando desde terminal
- **Navegador web** - Solo para peticiones GET

### Ejemplo con cURL:
```bash
# Crear producto
curl -X POST http://localhost:8080/api/productos \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Mouse","precio":250.00}'

# Ver todos los productos
curl http://localhost:8080/api/productos

# Actualizar producto
curl -X PUT http://localhost:8080/api/productos/1 \
-H "Content-Type:application/json" \
-d '{"nombre":"Libreta A5","precio":5.0}'

# Eliminar producto
curl -X DELETE http://localhost:8080/api/productos/1
```