package com.zhsw.helloWord;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zhengliang
 * @Description: helloword
 * @Date: 2019/12/26 17:30
 */
public class HelloService {
    @Autowired
    private HelloProperties helloProperties;
    public HelloService() {
    }
    public HelloService(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
    public String sayHello(){
       return
               "大家好,我是"+helloProperties.getName()
                       + ",今年"+helloProperties.getAge()+"岁,性别"
                       + helloProperties.getSex();
    }

}
