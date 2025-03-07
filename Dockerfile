FROM eclipse-temurin:21-jdk-jammy

WORKDIR /api

COPY target/skillsup-0.0.1-SNAPSHOT.jar skillsup-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "skillsup-0.0.1-SNAPSHOT.jar"]