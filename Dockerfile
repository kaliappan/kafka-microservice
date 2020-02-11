FROM maven:onbuild AS buildenv
FROM openjdk:jre-alpine
COPY --from=buildenv /target/kafka-microservice-0.0.1-SNAPSHOT.jar /kafka-microservice.jar
EXPOSE 8080
CMD ["java", "-jar", "/kafka-microservice.jar"]
