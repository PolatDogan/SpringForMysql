# Spring for MySQL Default
This project was created for MySQL's default world schema.


<p>  <a href="https://www.java.com" target="_blank" rel="noreferrer">   <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/></a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"><img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p>

---
### Step 1 - Generate Spring
![Image](https://i.imgur.com/Oo1yU0Z.png)
--->   [Spring initializr](https://start.spring.io/)
---
## Step 2 - MySQL Connection Configuration
>application.properties
 
```
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.hibernate.show-sql=true
spring.datasource.url=jdbc:mysql://localhost:3306/world
spring.datasource.username=root
spring.datasource.password=
spring.jpa.properties.javax.persistence.validation.mode = none

```
---

### Step 3 - Swagger UI and pom.xml Dependencies
```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>3.0.0</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
```
[Swagger 2 Documentation for Spring REST API](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)

---
### Step 4 - Integrating Swagger 2 UI into the Project
```
//add to main class
@Configuration
public class SpringFoxConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}
```
---
### Step 5 - Methods 

![Image](https://i.imgur.com/50PUUdi.png)


