FROM eclipse-temurin:17

WORKDIR /app

COPY . .

RUN javac */*.java Main.java

CMD ["java", "Main"]