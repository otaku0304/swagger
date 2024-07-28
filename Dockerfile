FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy the Maven wrapper and set execute permissions
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x ./mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy the source code
COPY src ./src

# Run the application
CMD ["./mvnw", "spring-boot:run"]
