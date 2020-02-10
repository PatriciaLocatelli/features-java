package feature10;

import java.util.Arrays;

public class LocalVariableTypeInference {
    public static void main(String[] args) {
        var versao = getVersao();
        System.out.println(versao);

        var nome = Arrays.asList("Gabriel", "Roger", "Thiago", "Jéssica", "Patricia");
        System.out.println(nome);

    }

    public static String getVersao() {
        return "Estou usando a versão: Java 10";
    }
}
