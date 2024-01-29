package lambda.app;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("meong");
        sayHello(null);
    }
    public static void sayHello(String name){

        Optional.ofNullable(name).map(value -> value.toUpperCase()).ifPresentOrElse(value -> System.out.println("Hello " + value), () -> System.out.println("HELLO"));


//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(name1 -> name1.toUpperCase());
//        optionalNameUpper.ifPresent(s -> System.out.println("Hello " + s));
    }
}
