package guru.springframework.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by reve99 on 3/29/2016.
 */
//@Component
//@Profile({"default","english"})
public class HelloWorldServiceEnglishImpl  implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hello Guru";
    }
}
