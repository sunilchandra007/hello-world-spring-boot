https://dzone.com/articles/deploying-spring-boot-microservice-to-docker-a-qui



mvn clean install
mvn spring-boot:run

docker build -t sample-hello-microservice-springboot .
docker images 


docker run -p 8080:8080 -t sample-hello-microservice-springboot 