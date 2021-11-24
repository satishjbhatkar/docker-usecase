FROM openjdk:8-jdk-alpine
RUN apk  update 
RUN apk add --no-cache wget
  
RUN wget https://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-alpine-linux-amd64-v0.6.1.tar.gz 
RUN tar -C /usr/local/bin -xzvf dockerize-alpine-linux-amd64-v0.6.1.tar.gz 
RUN rm dockerize*.tar.gz

ADD target/config-server-0.0.1-SNAPSHOT.jar config-server-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","config-server-0.0.1-SNAPSHOT.jar"]
CMD dockerize -wait tcp://api-mongodb:27017 -timeout 1m && java -jar config-server-0.0.1-SNAPSHOT.jar