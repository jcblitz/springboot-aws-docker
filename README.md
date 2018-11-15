# Introduction 

An overly simple Spring Boot application to build a Docker container that runs a fat Jar 

## Building the application

`mvn package`

## Running the application 

`mvn spring-boot:run`

### URLs

* `http://localhost:8080/`
* `http://localhost:8080/hello`
* `http://localhost:8080/actuator/health`

## Building the container

`docker build -t awsdocker .`

## Running the container

`docker run -p 5000:8080 awsdocker`

