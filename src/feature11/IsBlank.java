package feature11;

public class IsBlank {
    public static void main(String[] args) throws Exception {

        System.out.println(" ".isBlank());
        System.out.println("Qualquer coisa".isBlank());

        String s1 = "Qualquer coisa aqui";

        System.out.println(s1.isBlank());
        System.out.println("      ".isBlank());
    }
}
