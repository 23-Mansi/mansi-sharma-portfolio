# Use Java 24 with Maven installed
FROM maven:3.9.9-eclipse-temurin-24

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project
COPY . .

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Expose the port used by Spring Boot
EXPOSE 8080

# Run the generated JAR file
CMD ["java", "-jar", "target/portfolio-0.0.1-SNAPSHOT.jar"]