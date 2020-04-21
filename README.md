# microservices
Basic Spring Boot &amp; Cloud Microservices 


Microservices,
1. filter-service	http://localhost:9030
2. user-post-service	http://localhost:9010
3. user stats-service	http://localhost:9030

Feign (Proxy / Invoeks other ms / Solvex Problem to call another rest api service)
Ribbon client side load balancing

Actuator (Health)
http://localhost:{port}/actuator

Spring Cloud Config Server (Get config/pros for microservices for active profiles. Support Git & SVN)
http://localhost:8888

Eureka Naming Server (service reg and service discovery)
http://localhost:8761

Zuul API Gateway Server (Auth, Autho, Security, Rate Limits, Fault Toleration, Service Aggregation)
http://localhost:8765

Sleuth (Assign unique id to req for tracing across components)

Zipkin (Distributed Tracing System (Rabbit MQ))



