FROM openjdk:11
COPY target/spring-boot-db-app-1.1.jar usr/app
WORKDIR usr/app
ENTRYPOINT ["jar","-jar","spring-boot-db-app-1.1.jar"]