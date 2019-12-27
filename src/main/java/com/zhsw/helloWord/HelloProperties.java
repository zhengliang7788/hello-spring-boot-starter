package com.zhsw.helloWord;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: zhengliang
 * @Description: properties
 * @Date: 2019/12/26 17:36
 */
@ConfigurationProperties(prefix = "spring.hello")
public class HelloProperties {
    private String name;
    private int age;
    private String sex;
    public HelloProperties(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
