package cn.linyt.study.springbootdubboprovider.service.impl;

import cn.linyt.study.api.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName ProviderServiceImpl
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/16 1:45
 * @Version 1.0
 **/
@Service
//@Component
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String name) {

        return "Hello "+name;
    }
}
