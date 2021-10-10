FROM adoptopenjdk:8-jre

WORKDIR /app
COPY target .

ENTRYPOINT ["java", "-Xmx8m", "-Xms8m", "-jar", "/app/words.jar"]
EXPOSE 8080
