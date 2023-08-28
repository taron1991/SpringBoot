FROM amazoncorretto:17
COPY /target/BootProject-0.0.1-SNAPSHOT.jar /app.jar
CMD ["java","-jar","app.jar"]