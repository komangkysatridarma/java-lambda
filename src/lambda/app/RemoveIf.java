package lambda.app;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Meong", "auu", "HI", "Binus"));

        names.removeIf(name -> name.length() <= 3);
        System.out.println(names);


    }
}
