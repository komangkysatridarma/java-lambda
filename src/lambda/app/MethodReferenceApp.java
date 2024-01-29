package lambda.app;

import lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        //cara memanggil dengan memakai lambda
        Predicate<String> predicate = value -> StringUtil.isLowerCase(value);
        //cara memanggil dengan method reference
        Predicate<String> predicate1 = StringUtil::isLowerCase;

        System.out.println(predicate.test("Eko"));
        System.out.println(predicate.test("eko"));

        //method reference di parameter
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("komeng"));
    }

    public void run(){
        //cara memanggil dengan memakai lambda
        Predicate<String> predicate = this::isLowerCase;

        System.out.println(predicate.test("Eko"));
        System.out.println(predicate.test("eko"));
    }

    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicate = app::isLowerCase;

        System.out.println(predicate.test("Eko"));
        System.out.println(predicate.test("eko"));
    }

    public boolean isLowerCase(String value){
        for(var c : value.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }


}
