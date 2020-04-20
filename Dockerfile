#BASE IMAGE
FROM ubuntu:18.04
MAINTAINER Vipin Rai (XXXXXX@gmail.com)

WORKDIR /usr/local/workspace/

ADD target/Calculator-1.0-SNAPSHOT.jar Calculator/ 

