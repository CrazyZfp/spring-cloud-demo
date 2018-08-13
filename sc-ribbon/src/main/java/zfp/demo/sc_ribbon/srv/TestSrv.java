package zfp.demo.sc_ribbon.srv;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by zfp on 18-8-7.
 */
@Service
public class TestSrv {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errHandle")
    public String testReq() {
        return restTemplate.getForObject("http://provider/test?name", String.class);
    }

    private String errHandle() {
        return "ERROR OCCURED";
    }
}
