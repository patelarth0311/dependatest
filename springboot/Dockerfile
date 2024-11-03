FROM openjdk
WORKDIR /my-project
COPY build/libs/*.jar app.jar
CMD ["./gradlew", "clean", "bootJar"]
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]