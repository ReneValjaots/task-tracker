# Stage 1: Build the Spring Boot application using a multi-stage build for a smaller final image.
FROM bellsoft/liberica-runtime-container:jdk-24-musl as builder

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper, pom.xml, and the source code
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Make the Maven wrapper executable and package the application, skipping tests
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

# Stage 2: Create the final, lightweight image
FROM bellsoft/liberica-runtime-container:jre-24-musl

# Set the working directory
WORKDIR /app

# Copy the built JAR from the builder stage into the final image
COPY --from=builder /app/target/*.jar app.jar

# Expose the port the Spring Boot application will run on
EXPOSE 8080

# The command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]