package zfp.demo.sc_feign.srv.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import zfp.demo.sc_feign.srv.FeignTestSrv;

/**
 * Created by zfp on 18-8-7.
 */
@Service
public class FeignTestHystrix implements FeignTestSrv {

    @Override
    public String testSrv() {
        return "ERROR_OCCURED";
    }
}
