# PersonenVerwaltungREST

A Project which exposes a REST API created
using [Spring Data REST](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#reference) with CRUD
operations to manage Person, Address and City entities.
The Data is persisted in a postgres DB where the tables are auto created/updated by JPA using our Java Entities.
The Postgres DB is running inside a docker container, see [docker-compose.yaml](docker-compose.yaml)

## How to run the project

### Database

First you need to have docker installed on your machine. Either Docker Desktop for Windows or Docker on Linux.
Then you can run the Postgres DB as docker container by either starting it directly from
the [docker-compose.yaml](docker-compose.yaml) file with your IDE
or via the command line by navigating to the project root directory and running the following command:
```docker-compose up -d```
After that your postgres DB should be running on port 5432. If you want you can connect to the DB with your favorite DB
client and check the tables. The connection formation can be found inside the [docker-compose.yaml](docker-compose.yaml)
file.

### REST API Spring Application

If you are using IntelliJ you can use the provided run configuration to start the application.
[PersonenVerwaltungApplication](.idea%2FrunConfigurations%2FPersonenVerwaltungApplication.xml)
Otherwise, just run the `main` Method inside
the [PersonenVerwaltungApplication.java](src%2Fmain%2Fjava%2Fch%2Fhftm%2Fpersonenverwaltung%2FPersonenVerwaltungApplication.java)
class with any IDE.