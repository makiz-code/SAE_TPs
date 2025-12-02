FROM eclipse-temurin:21-jdk AS build

WORKDIR /TP2

COPY Hello.java .

RUN javac Hello.java

FROM eclipse-temurin:21-jre

WORKDIR /TP2

COPY --from=build /TP2/Hello.class .

CMD ["java", "Hello"]