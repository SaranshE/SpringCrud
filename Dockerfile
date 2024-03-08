FROM openjdk:17
EXPOSE 8080
ADD target/crud.jar crud.jar
ENTRYPOINT ["java","-jar","/crud.jar"]