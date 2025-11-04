#Start with a base iamge containion java runtime
FROM openjdk:21-jdk-slim

LABEL maintainer="Themba Ngobeni <https://github.com/thembatman0>"

#Add the application
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Comand that will execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]