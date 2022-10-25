Order 
-----
Dependency - Spring Web, Spring Data JPA, H2 Database, MySQL, Lombok, Eureka Discovery Client  
port: localhost:8080

Payment
--------
Dependency - Spring Web, Spring Data JPA, H2 Database, MySQL, Lombok, Eureka Discovery Client        
port: localhost:8081

Eurka Registry
---------------
Dependency - Eurka Server  
prot: localhost: 8761

Cloud Gateway API
-----------------
Dependency - Gateway, Eureka Discovery Client, Sprint Boot Actuator, Spring cloud stater Netflix Hystrix  
prot: 8989  

-------------
Add "spring-cloud-stater-config" dependency to every microservice to talk to cloud config  

