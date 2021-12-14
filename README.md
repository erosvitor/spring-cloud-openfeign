## About
The project shows how to implement communication between micro services using the Spring Cloud Open Feign.

## Technologies
The following technologies were used in this project:

* [Java Oracle](https://www.oracle.com/java/)
* [Apache Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
* [IDE Eclipse](https://www.eclipse.org/)

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
