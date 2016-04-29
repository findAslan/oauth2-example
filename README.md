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

TODO: java program