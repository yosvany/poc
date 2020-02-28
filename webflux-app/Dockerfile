FROM openjdk:8-jre-alpine
EXPOSE 8092
ADD ./build/libs/*.jar app.jar
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.7.3/wait /wait
RUN chmod +x /wait

CMD /wait && java -jar /app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

