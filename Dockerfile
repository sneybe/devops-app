FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/devops-app-0.0.1-SNAPSHOT.jar app.jar

# Créer un utilisateur non-root
RUN addgroup --system appgroup && \
    adduser --system --ingroup appgroup appuser
USER appuser

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
