package com.scm.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


@Configuration
public class AppConfig {

@Value("${cloudinary.cloud.name}")
private String cloud_name;
@Value("${cloudinary.api.key}")
private String api_key;
@Value("${cloudinary.api.secret}")
private String api_secret;

    @Bean
    public Cloudinary cloudinary(){

        return new Cloudinary(
            ObjectUtils.asMap(
                "cloud_name","dwvm1sgsc",
                "api_key","173469291366848",
                "api_secret","tyNU2Gab4uM79w3mxdv26vWtBL4"
            )
        );
    }

}
