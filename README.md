Eureka Registry
---------------
Dependency - Eurka Server  
prot: localhost: 8761  

Order 
-----
Dependency - Spring Web, Spring Data JPA, H2 Database, MySQL, Lombok, Eureka Discovery Client  
port: localhost:8080

Payment
--------
Dependency - Spring Web, Spring Data JPA, H2 Database, MySQL, Lombok, Eureka Discovery Client        
port: localhost:8081  

Cloud Gateway API 
-----------------
Dependency - Gateway, Eureka Discovery Client, Sprint Boot Actuator, Spring cloud stater Netflix Hystrix  
prot: 8989  

Postman  
post: http://localhost:8989/order/add  
get: http://localhost:8989/order  
post: http://localhost:8989/payment/add  
get: http://localhost:8989/payment  
get: http://localhost:8989/payment/{orderId}  

Sample:  
{
    "order":{
        "order_id": 1,
        "name" : "Order1",
        "price" : 150,
        "quantity": 2
    },
    "payment": {}
}





