package com.ndangducbn.startspringboot.controller;

import com.ndangducbn.startspringboot.bean.BlogProperties;
import com.ndangducbn.startspringboot.bean.ConfigBean;
import com.ndangducbn.startspringboot.bean.TestConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ConfigController {
    private final BlogProperties blogProperties;
    private final ConfigBean configBean;
    private final TestConfigBean testConfigBean;

    public ConfigController(BlogProperties blogProperties, ConfigBean configBean, TestConfigBean testConfigBean) {
        this.blogProperties = blogProperties;
        this.configBean = configBean;
        this.testConfigBean = testConfigBean;
    }

    @GetMapping("/blog")
    public String getBlog() {
        String name = this.blogProperties.getName();
        String title = this.blogProperties.getTitle();

        return "Blog Properties:     " +
                ".name: " + name +
                ".title: " + title;
    }

    @GetMapping("/config")
    public String getConfig() {
        String name = this.configBean.getName();
        String title = this.configBean.getTitle();
        String wholeTitle = this.configBean.getWholeTitle();

        return "Blog Properties:     " +
                ".name: " + name +
                ".title: " + title+
                ".wholeTitle: " + wholeTitle;
    }

    @GetMapping("/test")
    public String getTest() {
        String name = this.testConfigBean.getName();
        int age = this.testConfigBean.getAge();

        return "Test Config:     " +
                ".name: " + name +
                ".age: " + age;
    }
}
