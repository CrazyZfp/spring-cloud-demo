package zfp.demo.sc_provider1.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zfp.demo.sc_provider1.srv.Provider1Srv;

import javax.annotation.Resource;

/**
 * Created by zfp on 18-8-6.
 */
@RestController(value = "/")
public class Provider1Ctrl {

    @Value(value = "${spring.application.name}")
    private String clientName;

    @Value(value = "${server.port}")
    private String port;

    @Resource
    private Provider1Srv provider1Srv;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return clientName + ":" + port;
    }

    @RequestMapping(value = "testb", method = RequestMethod.GET)
    public String testB() {
        return provider1Srv.testReq();
    }
}
