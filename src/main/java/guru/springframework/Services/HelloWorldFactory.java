package guru.springframework.Services;

/**
 * Created by reve99 on 3/31/2016.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;
        switch (language){
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }
        return service;
    }

}
