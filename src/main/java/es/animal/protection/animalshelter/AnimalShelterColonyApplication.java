package es.animal.protection.animalshelter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalShelterColonyApplication {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        SpringApplication.run(AnimalShelterColonyApplication.class, args);
    }
}
