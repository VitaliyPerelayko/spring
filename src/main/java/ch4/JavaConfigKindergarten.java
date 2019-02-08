package ch4;

import ch4.kindergarten.FoodProviderServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
@Profile("kindergarten")
public class JavaConfigKindergarten {
    @Bean
    @Lazy(value = true)
    public FoodProviderService provideService (){
        return new FoodProviderServiceImpl();
    }
}
