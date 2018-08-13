package zfp.demo.sc_cnf_clt.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zfp on 18-8-13.
 */
@RestController
public class TestConfigCtrl {

    @Value("${hello}")
    private String hello;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return hello;
    }
}
