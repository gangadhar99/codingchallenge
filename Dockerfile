FROM openjdk:8
EXPOSE 8080
ADD target/coding-challange.jar coding-challange.jar
ENTRYPOINT ["java","-jar","/coding-challange.jar"]