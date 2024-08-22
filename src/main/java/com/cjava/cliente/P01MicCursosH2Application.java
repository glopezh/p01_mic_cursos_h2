package com.cjava.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // Para que se registre en el servidor Eureka
@SpringBootApplication
public class P01MicCursosH2Application {

    public static void main(String[] args) {
        SpringApplication.run(P01MicCursosH2Application.class, args);
    }

}
