package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        //penggunaan anonymus class
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Komeng";
//            }
//        };
//
//        System.out.println(simpleAction.action());
//
//        //penggunaan lambda
//        SimpleAction simpleAction1 = () -> {
//            return "Meong";
//        };
//        System.out.println(simpleAction1.action());

        SimpleAction simpleAction = (String value) -> {
            return "Hello " + value;
        };

        System.out.println(simpleAction.action("Komeng"));

        //jika lambda hanya satu baris bisa seperti ini
        //opsi 1
        SimpleAction simpleAction1 = (name) -> "Hello " + name;
        //opsi 2
        SimpleAction simpleAction2 = name -> "Hello " + name;
    }
}