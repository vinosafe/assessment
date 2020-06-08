# assessment
Java Developer Expertise Test


Create a service capable of serving the following endpoints:
For all of the below endpoints a log entry needs to be created for their execution duration.

/conversions/ktoc
The ktoc endpoint should produce an output amount in celsius when given an input amount in kelvin.

/conversions/ctok
The ctok endpoint should produce an output amount in kelvin when given an input amount in celsius.

/conversions/mtok
The mtok endpoint should produce, when given an input amount in miles, an output amount in kilometers.

/conversions/ktom
The ktom endpoint should produce, when given an input amount in kilometers, an output amount in miles.

Run instructions:

This is a Spring Boot application. 

1. Make sure you have atleast Java 8 installed on your machine
2. This is a Maven application and as such to package it do the following
 - mvn clean package
3. Run it using the following
 - java -jar target/assessment-0.0.1-SNAPSHOT.jar
4. To interact with the REST APIs go to
 - http://localhost:8080/swagger-ui.html
5. You are now ready to test the conversions
6. Have fun
