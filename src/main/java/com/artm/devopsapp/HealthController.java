package com.artm.devopsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "status", "UP",
            "app", "devops-app",
            "team", "ARTM"
        );
    }

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of(
            "version", "1.0.0",
            "env", System.getenv().getOrDefault("ENV", "local")
        );
    }
}
