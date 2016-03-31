package guru.springframework.config;

import guru.springframework.Services.HelloWorldFactory;
import guru.springframework.Services.HelloWorldService;
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
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }
    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return factory.createHelloWorldService("es");
    }
}
