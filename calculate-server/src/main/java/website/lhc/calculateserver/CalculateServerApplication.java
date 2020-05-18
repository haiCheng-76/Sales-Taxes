package website.lhc.calculateserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.math.BigDecimal;

@EnableEurekaClient
@SpringBootApplication
public class CalculateServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateServerApplication.class, args);
    }
}
