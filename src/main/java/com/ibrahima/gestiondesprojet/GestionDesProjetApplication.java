package com.ibrahima.gestiondesprojet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")

public class GestionDesProjetApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesProjetApplication.class, args);
    }
}
