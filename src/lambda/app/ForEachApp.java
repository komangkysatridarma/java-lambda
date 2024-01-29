package lambda.app;

import java.util.List;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> names = List.of("Komeng", "kysa", "Tri", "Darma");

        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

    }
}

