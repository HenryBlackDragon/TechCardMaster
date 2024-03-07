FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean install

FROM eclipse-temurin:21-alpine
WORKDIR /app
ARG JAR_FILE=/app/target/*.jar
COPY --from=builder ${JAR_FILE} techcard-master.jar
CMD ["java", "-jar", "/app/techcard-master.jar"]