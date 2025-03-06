# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

#CMD ["mvn", "spring-boot:run"]

# Copy the application JAR (replace with actual JAR name)
#COPY target/RedisDemo-0.0.1-SNAPSHOT.jar app/app.jar

# Expose the application port
#EXPOSE 8080

# Run the application
#ENTRYPOINT ["java", "-jar", "app.jar"]
