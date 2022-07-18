package sg.edu.nus.iss.d11workshop;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class D11workshopApplication {

	public static void main(String[] args) {
		//SpringApplication.run(D11workshopApplication.class, args);
		SpringApplication app = new SpringApplication(D11workshopApplication.class);

		String port = "8085";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		//or you can server.port=8085 in the application.properties file


		if(cliOpts.containsOption("port")) {
			System.out.println("The argument is set");
			port = cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
	}

	//adding basic logging capabilities
	//also add the line from day 11 slide 18 to the application.properties file

	@Bean
	public CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	}

}
