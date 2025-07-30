# Use AdoptOpenJDK 17 as base image
FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /app/server

# Copy the packaged JAR file into the container at /app
COPY target/core-server.jar /app/core-server.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "/app/core-server.jar"]
