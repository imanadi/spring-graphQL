# GraphQL Spring Boot Project

This project is a simple GraphQL server built with Spring Boot.

## Technologies Used

- Java
- Spring Boot
- Maven
- GraphQL

## Project Structure

The project is structured as follows:

- `src/main/java/com/learning/graphql/controllers`: Contains the controllers for handling GraphQL queries.
- `src/main/java/com/learning/graphql/schemas`: Contains the GraphQL schema definitions and related Java classes.
- `src/main/resources`: Contains application properties and GraphQL schema files.

## GraphIQL queries 

query groupDetails {
  getByName(name:"group-1"){
    name
    description
    members{
      name
      age
      email
    }
  }
}


query memberList{
  getAllMembers{
    name
    email
    age
  }
}




## Running the Project

To run the project, use the following command:

```bash
mvn spring-boot:run

