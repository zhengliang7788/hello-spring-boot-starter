package com.zhsw.helloWord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhengliang
 *
 * @Date: 2019/12/26 17:45
 */
//开启配置
@Configuration
//开启使用映射实体对象
@EnableConfigurationProperties(HelloProperties.class)
//当类路径classpath下有指定的类的情况下进行自动配置
@ConditionalOnClass(HelloService.class)
//当配置文件中example.service.enabled=true时进行自动配置，如果没有设置此值就默认使用matchIfMissing对应的值
@ConditionalOnProperty(prefix = "spring.hello",value = "enabled",matchIfMissing = true)
public class HelloServiceAutoConfig {
    @Autowired
    private HelloProperties helloProperties;

    @Bean
    //当容器(Spring Context)中没有指定Bean的情况下进行自动配置
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService = new HelloService(helloProperties);
        return  helloService;
    }

}
