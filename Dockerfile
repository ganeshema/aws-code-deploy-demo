FROM openjdk:21
WORKDIR /app
EXPOSE 8080
COPY ./target/aws-code-deploy.jar /app
ENTRYPOINT ["java","-jar", "aws-code-deploy.jar"]
