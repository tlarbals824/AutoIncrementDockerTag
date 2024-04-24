FROM amazoncorretto:17-alpine
COPY /build/libs/AutoIncrementDockerTag.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
