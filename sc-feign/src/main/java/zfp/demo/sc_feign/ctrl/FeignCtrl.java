package zfp.demo.sc_feign.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zfp.demo.sc_feign.srv.FeignTestSrv;

import javax.annotation.Resource;

/**
 * Created by zfp on 18-8-7.
 */
@RestController
public class FeignCtrl {

    @Resource
    private FeignTestSrv feignTestSrv;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String actionTest() {
        return feignTestSrv.testSrv();
    }
}
