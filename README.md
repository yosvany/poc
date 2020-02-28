# poc

Ejemplo 

-  Spring cloud admin   
-  Spring cloud Config server
-  Spring cloud netflix Eureka
-  Jaeger Server
-  Apache Kafka + Zookiper + kafka manager (una UI para kafka)
-  Una app de ejemplo con webflux  y Swagger
-  Una app de ejemplo con un endpoint rest con swagger

Las dos apps y el admin esperan a que los dos servicios (eureka y config) estén levantados, se registran en eureka y leen su configuracion desde el config server.

El admin lee las apps desde el eureka y via actuator, extrae informacion de la app en tiempo real que podeis ver haciendo clien en cada una de ellas.


Para probarlo, antes debeis tener java, docker y docker-compose instalados luego desde la raiz del proyecto:


buscad la ip local de la maquina (no 127.0.0.1 sino la 172.x.x.x o 192.168.x.x)


desde un terminal en linux / mac

> export IP=x.x.x.x
> for p in app1 admin-server config-server eureka-server webflux-app; do gradle -p  ./$p clean assemble;  done
> docker-compose up --build

El "cluster" deberia levantar y podréis acceder a todo en estas urls:

eureka: 		http://localhost:8761
Admin:  		http://localhost:9000

Jaeger Server: http://localhost:16686/   (esto es una mejora sobre zipkin)

Swagger de app con webflux: http://localhost:8092/swagger-ui.html
Swagger de la otra app    : http://localhost:8091/swagger-ui.html

Haced alguna llamada desde el swagger y luego podreis ver las llamadas en el Jaeger.