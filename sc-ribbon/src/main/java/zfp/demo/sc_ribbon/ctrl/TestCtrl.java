package zfp.demo.sc_ribbon.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zfp.demo.sc_ribbon.srv.TestSrv;

import javax.annotation.Resource;

/**
 * Created by zfp on 18-8-7.
 */
@RestController
public class TestCtrl {

    @Resource
    private TestSrv testSrv;

    @RequestMapping(method = RequestMethod.GET,value = "test")
    public String actionTest(){
        return testSrv.testReq();
    }
}
