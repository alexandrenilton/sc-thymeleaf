package education.scthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"education.scthymeleaf"})
public class ScThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScThymeleafApplication.class, args);
    }

}
