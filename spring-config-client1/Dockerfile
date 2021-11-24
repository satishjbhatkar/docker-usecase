FROM openjdk:8-jdk-alpine
RUN apk  update 
RUN apk add --no-cache wget
  
RUN wget https://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-alpine-linux-amd64-v0.6.1.tar.gz 
RUN tar -C /usr/local/bin -xzvf dockerize-alpine-linux-amd64-v0.6.1.tar.gz 
RUN rm dockerize*.tar.gz
ADD target/spring-config-client1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9090
#ENTRYPOINT ["java","-jar","app.jar"]
CMD dockerize -wait tcp://config-server:8888 -timeout 1m && java -jar app.jar