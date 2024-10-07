FROM adoptopenjdk/openjdk:8-jdk-alpine

EXPOSE 8080

COPY target/spring_boot_rest-0.0.1-SNAPSHOT.jar springApp.jar

CMD ["java", "-jar", "springApp.jar"]