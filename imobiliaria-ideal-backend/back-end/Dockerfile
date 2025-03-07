# Etapa 1: Build
FROM maven:3.9.2-eclipse-temurin-17-alpine AS build
WORKDIR /app

# Copia o POM e as dependências para a imagem
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o código da aplicação para o container
COPY src ./src

# Compila a aplicação
RUN mvn package -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copia o artefato gerado na etapa de build
COPY --from=build /app/target/*.jar app.jar

# Exposição da porta padrão
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
