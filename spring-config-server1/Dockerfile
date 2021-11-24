FROM openjdk:8-jdk
# Add hello scripts
ADD target/spring-config-server1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8888
#ENTRYPOINT ["java","-jar","app.jar"]
CMD  java -jar app.jar