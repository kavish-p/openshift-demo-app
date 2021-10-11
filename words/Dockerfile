# Build the application first using Mave
FROM maven:3.8-openjdk-11 as build
WORKDIR /app
COPY . .
RUN mvn clean package assembly:single

# Inject the JAR file into a new container to keep the file small
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/words-jar-with-dependencies.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx8m", "-Xms8m", "-jar", "app.jar"]