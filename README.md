# Spring Security OAuth2 Example

This is an example demostrating spring security oauth2.  
There should be three components: spring-auth-server, springwebapp, javaprogram.  
spring-auth-server: an authentication and authorization server using spring-security-oauth2  
springwebapp: a resource server  
javaprogram: an application stimulating a mobile app  

## spring-auth-server

Requirements: mysql, java7  
There are some scripts that have to be run first before starting the server, see the README.
```
mvn spring-boot:run
```
Server will be running on port 8880

## springwebapp

Start server:
```
mvn spring-boot:run
```
Server will be running on port 8080

## JavaWebapp

Was going to do javaprogram but changed to JavaWebapp, modeling a web application that is accessing the resource server.
```
mvn spring-boot:run
```
Server will be running on port 8088

To test open web browser to http://localhost:8088/client it will redirect you http://localhost:8880 for authentication then to http://localhost:8880/oauth/authorize for authorization then back to http://localhost:8088/client where it will retrieve the resources on http://localhost:8080/

TODO: java program