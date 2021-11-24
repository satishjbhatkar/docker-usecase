FROM openjdk:8-jdk-alpine
ADD target/spring-config-client-0.0.1-SNAPSHOT.jar app.jar
# Add wait-for-it
COPY wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh
EXPOSE 80
EXPOSE 443
EXPOSE 9090
ENTRYPOINT [ "/bin/sh", "-c" ]
CMD ["wait-for-it.sh" , "client-config:9090" , "--strict" , "--timeout=10" , "--" , "java -jar app.jar"]
