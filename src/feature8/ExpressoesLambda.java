package feature8;


import java.util.Arrays;

public class ExpressoesLambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Utilizando uma expressão Lambda para Thread")).start();

        Arrays.asList(0,1,2,3,4,5,6,7,8,9,10).stream().filter(x-> x % 2 == 0).forEach(System.out::println);
    }
}
