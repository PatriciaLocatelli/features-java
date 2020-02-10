package feature8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenarColecao {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Patricia", "Jéssica", "Roger", "Gabriel", "Thiago");

        Collections.sort(lista);
        System.out.println(lista);

    }
}
