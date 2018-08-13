package zfp.demo.sc_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by zfp on 18-8-9.
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

    public static void main(String args[]) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
