package ie.atu.exam_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExamProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamProductApplication.class, args);
    }

}
