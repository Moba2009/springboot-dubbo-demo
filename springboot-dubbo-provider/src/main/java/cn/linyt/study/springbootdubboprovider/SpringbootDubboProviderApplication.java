package cn.linyt.study.springbootdubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDubbo(scanBasePackages = "cn.linyt.study.springbootdubboprovider.service.impl")
@SpringBootApplication
public class SpringbootDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProviderApplication.class, args);
	}

}
