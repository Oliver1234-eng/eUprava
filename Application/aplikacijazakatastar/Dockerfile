# Build stage
FROM maven:3.8.4-jdk-11 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Production stage
FROM openjdk:11-jre-slim
COPY --from=build /app/target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar", "--server.port=8081"]

#FROM openjdk:11
#VOLUME /notar
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#EXPOSE 8083