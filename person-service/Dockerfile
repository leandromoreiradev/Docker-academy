# Escolha uma imagem base com o Java instalado (por exemplo, OpenJDK)
FROM openjdk:17-jdk-slim

# Copia seu arquivo .jar para dentro do contêiner
COPY target/person-service-0.0.1-SNAPSHOT.jar /app/person-service-0.0.1-SNAPSHOT.jar

# Define o comando padrão para rodar o programa Java
CMD ["java", "-jar", "/app/person-service-0.0.1-SNAPSHOT.jar"]