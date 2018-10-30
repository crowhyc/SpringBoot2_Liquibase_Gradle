package com.javanewb.staging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Description: com.javanewb.staging
 * </p>
 * date：2018/10/30
 * email:crowhyc@163.com
 *
 * @author Dean.Hwang
 */
@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
