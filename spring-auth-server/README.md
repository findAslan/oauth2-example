# Sample Spring Authentication Authorization Server

This project contains a sample spring authentication and authorization server. Authentication information is stored in mysql. Run the scripts schema.sql and data.sql to create and populate the database.

Import schema and data:
```
mysql -u root -p < schema.sql
mysql -u root -p < data.sql
```

Run the server:
```
mvn package -DskipTests
java -jar target/spring-auth-server.jar
```

To test:
```
curl -v http://my-trusted-client:@localhost:8880/oauth/token -d grant_type=password -d username=user -d password=user
{"access_token":"bace209f-bf02-4ca7-98ec-8e21c2f100a6","token_type":"bearer","refresh_token":"337300a7-8c51-43cd-b028-8a0adf2523ca","expires_in":59,"scope":"read write trust"}
```

