FROM maven:3.6.1-jdk-12

VOLUME /tmp

COPY . /rootapp/

WORKDIR /rootapp

ARG JAR_FILE=target/demoSpringApplication.jar

ADD ${JAR_FILE} /demo.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "/demo.jar"]






