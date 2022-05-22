FROM openjdk:11

ADD target/spring-app-1.0-SNAPSHOT.jar spring-app.jar

ENTRYPOINT ["java", "-jar", "spring-app.jar"]