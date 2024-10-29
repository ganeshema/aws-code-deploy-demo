# Use an OpenJDK image as the base
FROM openjdk:21



# Expose the application's port (change if different)
EXPOSE 8080

# Copy the Spring Boot JAR file from the target directory to the working directory
COPY ./target/aws-code-deploy.jar aws-code-deploy.jar

# Set the entry point to run the Spring Boot application
CMD ["java", "-jar", "aws-code-deploy.jar"]
