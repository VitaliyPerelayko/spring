package ch4;

import ch4.highschool.FoodProviderServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
//@Profile("highschool")
public class JavaConfigHighschool {
    @Bean(name = "provideService")
    @Lazy(value = true)
    public FoodProviderService provideService (){
        return new FoodProviderServiceImpl();
    }
}
