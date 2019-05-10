FROM openjdk:8-jdk-alpine
MAINTAINER khan hafizur rahman <khr.1380@gmail.com>
VOLUME /tmp
EXPOSE 8080
COPY hisebnikash-web/target/docker-hiseb-nikash.jar docker-hiseb-nikash.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-hiseb-nikash.jar"]