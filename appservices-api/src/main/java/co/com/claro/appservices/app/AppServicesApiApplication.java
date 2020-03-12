package co.com.claro.appservices.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AppServicesApiApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppServicesApiApplication.class);

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Value("${spring.datasource.url}")
	public String urlDb;

	public static void main(String[] args) {
		SpringApplication.run(AppServicesApiApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("=======================================");

		LOGGER.info("url de la bd: ".concat(urlDb));

		String password = "6WUpuHzGkEYa1YnOM0lXqDe8e0hx9cFn";

		for(int i = 0; i < 4; i++) {
			String passwordBcrypt = passwordEncoder.encode(password);
			System.out.println(passwordBcrypt);
		}
	}
}
