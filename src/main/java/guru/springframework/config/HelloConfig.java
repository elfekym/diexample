package guru.springframework.config;

import guru.springframework.Services.HelloWorldServiceEnglishImpl;
import guru.springframework.Services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by reve99 on 3/31/2016.
 */
@Configuration
public class HelloConfig {
    @Bean
    @Profile("english")
    public HelloWorldServiceEnglishImpl helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }
    @Bean
    @Profile("spanish")
    public HelloWorldServiceSpanishImpl helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }
}
