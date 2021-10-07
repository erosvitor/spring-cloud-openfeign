## About
The project shows how to implement communication between micro services using the Spring Cloud Open Feign.

## Technologies
The following tools were used in this project:

* [Java Oracle](https://www.oracle.com/java/)
* [Apache Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
* [IDE Eclipse](https://www.eclipse.org/)

## Requirements
Before starting this project you need to have Git, JDK Oracle, Maven and Eclipse IDE installed.

## Starting the project

### Clonning the project
```
$ git clone https://github.com/erosvitor/spring-cloud-openfeign.git

$ cd spring-cloud-openfeign
```

### Testing the project
**Step 1:** Start the microservices using Eclipse IDE or by Maven command line
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

## License
This project is under license from MIT. For more details, see the LICENSE file.

## Release History
* 1.0.1 (2021-08-03)
    * Spring Boot updated to 2.5.3
    * Spring Cloud updated to 2020.0.3
    * Section 'references' added
* 1.0.0 (2021-05-15)
    * First version
