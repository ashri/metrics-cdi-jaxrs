# metrics-cdi-jaxrs

A very simple example JAX-RS application using Metrics-CDI.

The application currently demonstrates some inconsistencies between Wildfly 10.1, TomEE 7.0.2 and Payara 172 in deployment.

Wildfly 10.1 is the only application server which currently runs the example.

## To Run:

`mvn clean package`

Deploy the `metrics-cdi-jaxrs.war` file to the application server.
