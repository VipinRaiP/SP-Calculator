#BASE IMAGE
FROM openjdk:8
MAINTAINER Vipin Rai
RUN mkdir /usr/src/myapp
COPY  Calculator-1.0-SNAPSHOT.jar /usr/src/myapp
WORKDIR /usr/src/myapp
#RUN  java -cp Calculator-1.0-SNAPSHOT.jar com/calculator/Calculator
CMD ["java","-cp","Calculator-1.0-SNAPSHOT.jar","com/calculator/Calculator"]


