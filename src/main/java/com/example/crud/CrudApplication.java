package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class CrudApplication {

    public static void main(String[] args) {



        SpringApplication.run(CrudApplication.class, args);

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);

    }

}
