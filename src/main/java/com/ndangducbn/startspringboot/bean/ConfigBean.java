package com.ndangducbn.startspringboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "ducterry.blog")
@Data
public class ConfigBean {
    private String name;
    private String title;
    private String wholeTitle;
}

