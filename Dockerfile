FROM openjdk:8
EXPOSE 8080
ADD target/docker-demo-1.jar docker-demo-1.jar
ENTRYPOINT ["java","-jar","docker-demo-1.jar"]