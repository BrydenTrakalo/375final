FROM openjdk:8-jdk
RUN apt-get update
RUN apt-get install -y maven
# COPY src /usr/local/service/src
# WORKDIR /usr/local/service/src
RUN mvn package
CMD ["java","-cp","target/app-1.0-SNAPSHOT.jar","com.uregina.app.App"]
