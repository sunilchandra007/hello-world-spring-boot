FROM java:8
EXPOSE 8080
ADD /target/hello-world-spring-boot-0.0.1-SNAPSHOT.jar hello-world-spring-boot.jar
ENTRYPOINT ["java", "-jar", "hello-world-spring-boot.jar"]