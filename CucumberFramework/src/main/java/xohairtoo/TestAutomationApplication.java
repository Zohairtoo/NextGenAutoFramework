package xohairtoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.xohairtoo"})
public class TestAutomationApplication {

	static void main(String[] args) {
		SpringApplication.run(TestAutomationApplication.class, args);
	}

}
