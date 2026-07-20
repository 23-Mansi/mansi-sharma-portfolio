FROM maven:3.9.9-eclipse-temurin-24

WORKDIR /app

COPY . .

# Give execute permission to mvnw
RUN chmod +x mvnw

# Build the project
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/portfolio-0.0.1-SNAPSHOT.jar"]