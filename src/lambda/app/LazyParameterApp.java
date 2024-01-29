package lambda.app;

import java.util.function.Supplier;

public class LazyParameterApp {
    public static void main(String[] args) {
        testScore(70, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name){
        if(score >= 80 && score <= 100){
            System.out.println("Selamat " + name.get() + " Anda Lulus!");
        }else{
            System.out.println("Bye, Coba Lagi Taun Depan");
        }
    }

    public static String getName(){
        System.out.println("Method getName dipanggil!");
        return "Meong";
    }
}
