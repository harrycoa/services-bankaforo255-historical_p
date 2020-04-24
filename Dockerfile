FROM openjdk:13
VOLUME /tmp
EXPOSE 8097
ADD ./target/services-bankaforo255-historical_p-0.0.1-SNAPSHOT.jar service-historical_p.jar
ENTRYPOINT ["java", "-jar","/service-historical_p.jar"]