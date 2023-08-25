FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/com.conainer.security-0.0.1-SNAPSHOT.jar aswathy-conainer-security-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","aswathy-conainer-security-0.0.1-SNAPSHOT.jar"]