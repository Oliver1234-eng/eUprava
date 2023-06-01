# Build stage
FROM maven:3.8.4-jdk-11 AS build
COPY /. /.
#WORKDIR /app
RUN mvn clean package
ENTRYPOINT ["java","-jar","target/aplikacijazakatastar-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081

# Production stage
#FROM openjdk:11-jre-slim
#COPY --from=build /app/target/*.jar /app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar", "--server.port=8081"]

#FROM openjdk:11
#VOLUME /katastar
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar", "--server.port=8081"]