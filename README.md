# Inventory Management System

A simple inventory management system built with Spring Boot that allows users to manage products and categories.

## Features

- Product management (create, read, update, delete)
- Category management (create, read, update, delete)
- Relational data between products and categories
- Modern UI with Material Design styling

## Technologies Used

- **Backend**: Java with Spring Boot 3.4.5
- **Database**: H2 in-memory database
- **Frontend**: Thymeleaf, HTML, CSS
- **UI Components**: Material Design icons and styling

## Project Structure

- `src/main/java/com/example/estoque/`
  - `controller/` - Contains controllers for handling HTTP requests
  - `entity/` - JPA entity classes
  - `repository/` - Spring Data JPA repositories
- `src/main/resources/`
  - `static/` - CSS stylesheets
  - `templates/` - Thymeleaf HTML templates
  - `application.properties` - Application configuration

## Prerequisites

- Java 21 or higher
- Maven 3.6+ (or use the included Maven wrapper)

## Getting Started

### Running the Application

1. Clone the repository:

 - git clone `https://github.com/deLaraaaa/blackberry-sunglasses` 
   - cd blackberry-sunglasses

2. Run the application using Maven:

 - `./mvnw spring-boot:run` or `mvn spring-boot:run`

For Windows users:

 - mvnw.cmd spring-boot:run

3. Access the application in your web browser:
http://localhost:8081


### Using the Application

#### Products Management
- View all products at `/produtos`
- Add a new product at `/produtos/novo`
- Edit a product at `/produtos/{id}/editar`
- Delete products using the delete button in the product list

#### Categories Management
- View all categories at `/categorias`
- Add a new category at `/categorias/nova`
- Edit a category at `/categorias/{id}/editar`
- Delete categories using the delete button in the category list

## Database

The application uses an H2 in-memory database. You can access the H2 console at:
http://localhost:8081/h2-console


Database connection settings:
- JDBC URL: `jdbc:h2:mem:estoque_db`
- Username: `sa`
- Password: (leave empty)

## Notes

- This is a demo application with an in-memory database. Data will be lost when the application is restarted.

## License

This project is licensed under the MIT License.