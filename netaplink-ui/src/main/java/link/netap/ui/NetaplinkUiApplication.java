package link.netap.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class NetaplinkUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetaplinkUiApplication.class, args);
    }

}
