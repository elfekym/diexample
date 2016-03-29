package guru.springframework.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by reve99 on 3/29/2016.
 */
@Component
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hola Guru";
    }
}
