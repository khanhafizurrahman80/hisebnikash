FROM java:8
ADD hisebnikash-web/target/docker-hiseb-nikash.jar docker-hiseb-nikash.jar
EXPOSE 8085
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-hiseb-nikash.jar"]