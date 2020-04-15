package cn.linyt.study.springbootdubboconsumer.controller;

import cn.linyt.study.api.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/16 2:39
 * @Version 1.0
 **/
@RestController
public class ConsumerController {

    @Reference
    private ProviderService providerService;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){

        return providerService.sayHello(name);
    }
}
