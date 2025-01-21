package br.com.alurafood.pagamentos2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Pagamentos2Application {

	public static void main(String[] args) {
		SpringApplication.run(Pagamentos2Application.class, args);
	}

}
