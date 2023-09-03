FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17.0.2-jdk
COPY --from=build /target/BusHop-0.0.1-SNAPSHOT.jar BusHop.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","BusHop.jar" ]