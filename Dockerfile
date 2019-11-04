FROM openjdk:8
ADD target/addis-miniproject.jar addis-miniproject.jar
EXPOSE 8082
ENTRYPOINT ["java",   "-jar",  "addis-miniproject.jar"]