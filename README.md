# SpringCloudOpenFeign

## Description
Project that show how to implement communication between micro services using the Spring Cloud Open Feign.

## Technologies
The project use the following technologies:

* Java 11
* Apache Maven
* Project aggregation
* Spring Boot
* Spring Cloud OpenFeign
* IDE Eclipse

## Testing the project
**Step 1:** Start the microservices
* ServiceOne
* ServiceTwo

**Step 2:** Access the endpoint of ServiceOne microservice

```
http://localhost:8890/serviceone
```

**Step 3:** Access the endpoint of ServiceTwo microservice

```
http://localhost:8891/servicetwo
```

**Step 3:** Access the ServiceOne from ServiceTwo

```
http://localhost:8891/invokeserviceone
```

**Step 4:** Checking fault tolerance
* Stop the ServiceOne microservice
* Access the endpoint *http://localhost:8891/invokeserviceone*

The following message will be displayed:

```
Service ONE is down!!!
```

## References
[Spring Boot](https://spring.io/projects/spring-boot)  
[Spring Cloud](https://spring.io/projects/spring-cloud)  
[Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)

## Release History
* 1.0.1 (2021-08-03)
    * Spring Boot updated to 2.5.3
    * Spring Cloud updated to 2020.0.3
    * Section 'references' added
* 1.0.0 (2021-05-15)
    * First version
