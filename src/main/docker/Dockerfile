FROM java:8
MAINTAINER Fernando Fazolli<fernandofazolli@gmail.com>
ADD demodocker.jar demodocker.jar
VOLUME /tmp
RUN bash -c 'touch /demodocker.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/demodocker.jar"]