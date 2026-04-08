FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/movie-booking-system-1.0.jar app.jar

CMD ["java", "-jar", "app.jar"]