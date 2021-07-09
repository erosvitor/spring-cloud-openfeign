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
* Spring Cloud Netflix Hystrix
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

## Release History
* 1.0.0 (2021-05-15)
    * First version
