FROM amazoncorretto:8-alpine3.13
WORKDIR /app
COPY . /app/
RUN javac csv_combiner.java
ENTRYPOINT ["java", "csv_combiner"]

