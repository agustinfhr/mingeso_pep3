package backend.tingeso.facil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PreguntaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreguntaApplication.class, args);
	}

}
