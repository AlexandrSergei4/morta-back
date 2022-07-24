package com.alki.mortaback;

import com.alki.mortaback.data.model.SensitiveApp;
import com.alki.mortaback.data.repositories.SensitiveAppRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class MortaBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MortaBackApplication.class, args);
    }

}
