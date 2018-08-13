package zfp.demo.sc_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by zfp on 18-8-7.
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

    public static void main(String args[]) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
