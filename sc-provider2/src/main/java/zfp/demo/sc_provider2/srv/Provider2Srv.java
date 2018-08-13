package zfp.demo.sc_provider2.srv;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by zfp on 18-8-7.
 */
@Service
public class Provider2Srv {

    @Resource
    private RestTemplate restTemplate;

    public String testReq() {
        return restTemplate.getForObject("http://provider/test", String.class);
    }

}
