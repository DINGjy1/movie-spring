package com.dldx.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FilePathConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("请求图片");
        //和页面有关的静态目录都放在项目的static目录下
        registry.addResourceHandler("/upload/**").addResourceLocations("file:d:/file_io/upload/");
    }

}

