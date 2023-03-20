FROM maven:3.8-openjdk-17 as builder
MAINTAINER joshua-lehmann
WORKDIR /app
COPY src src
COPY pom.xml pom.xml
RUN ls -la
RUN mvn clean install -DskipTests

FROM azul/zulu-openjdk-alpine:17

COPY --from=builder /app/target/*.jar /app/application.jar


#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} application.jar

ENTRYPOINT ["java","-jar","/app/application.jar"]
