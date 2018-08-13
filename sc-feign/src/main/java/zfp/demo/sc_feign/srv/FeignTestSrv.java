package zfp.demo.sc_feign.srv;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zfp.demo.sc_feign.srv.impl.FeignTestHystrix;

/**
 * Created by zfp on 18-8-7.
 */
@FeignClient(value = "provider", fallback = FeignTestHystrix.class)
public interface FeignTestSrv {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String testSrv();

}
