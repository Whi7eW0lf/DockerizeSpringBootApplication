FROM maven:3.8.5 AS maven
WORKDIR /app
COPY . /app
RUN mvn clean package
# Compile and package the application to an executable JAR with Maven

FROM openjdk:17
#Defines a base image to start the build process. In other words, the FROM command specifies the Docker image that you’ll use in your Docker run time.
ARG JAR_FILE=target/spring-boot-docker.jar
#Jar file name is defined in pom.xml file with tag <finalName>
#IMPORTANT: After execute "mvn clean package" generated jar is in /target directory
COPY ${JAR_FILE} spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
