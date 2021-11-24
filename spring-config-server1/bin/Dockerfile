FROM openjdk:8-jdk-alpine
# Add hello scripts

ADD target/spring-config-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8888