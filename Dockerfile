#BASE IMAGE
FROM openjdk:8
MAINTAINER Vipin Rai
RUN mkdir /usr/src/myapp
COPY  target/Calculator-1.0-SNAPSHOT.jar /usr/src/myapp
WORKDIR /usr/src/myapp
