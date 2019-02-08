package com.vitaliy.prospring4;

import ch4.Food;
import ch4.FoodProviderService;
import ch4.JavaConfigHighschool;
import ch4.JavaConfigKindergarten;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Profiles;

import java.util.List;

@SpringBootApplication
public class Prospring4Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                JavaConfigHighschool.class);
        ctx.getEnvironment().acceptsProfiles(Profiles.of("highschool"));
        FoodProviderService foodProviderService = ctx.getBean("provideService",FoodProviderService.class);
        List<Food> lunchSet = foodProviderService.provideLunchSet();
        for (Food f:lunchSet){
            System.out.println(f.getName());
        }
    }
}

