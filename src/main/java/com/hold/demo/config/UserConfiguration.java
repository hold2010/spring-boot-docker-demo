package com.hold.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.hold.springboot")
@PropertySource("classpath:config/user.properties")
public class UserConfiguration {

    private String author;
    private int age;
    private String sex;
    private String time;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
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
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "ConfigProperties [author=" + author + ", age=" + age + ", sex=" + sex + ", time=" + time + "]";
    }

}
