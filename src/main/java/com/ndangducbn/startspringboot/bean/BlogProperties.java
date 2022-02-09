package com.ndangducbn.startspringboot.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class BlogProperties {
    @Value("${ducterry.blog.name}")
    private String name;

    @Value("${ducterry.blog.title}")
    private String title;
}
