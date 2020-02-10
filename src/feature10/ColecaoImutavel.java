/**
 * https://www.mballem.com/post/java-10-o-que-ha-de-novo/
 */
package feature10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColecaoImutavel {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Roger");
        lista.add("Jéssica");
        lista.add("Patricia");
        lista.add("Thiago");
        lista.add("Gabriel");

        var copiaLista = Set.copyOf(lista);
        copiaLista.forEach(System.out::println);

        System.out.println("\nAdicionar a string 'Oi' em copiaLista \n");
        try {
            copiaLista.add("Oi");
            copiaLista.forEach(System.out::println);
        } catch (UnsupportedOperationException e) {
            System.out.println("Deu erro :'( UnsupportedOperationException");
        }

        System.out.println("\nUsando o Set");
        var collectionSet = Set.of("Cachorro", "Gato", "Papagaio", "Cavalo");
        collectionSet.forEach(System.out::println);

        System.out.println("\nVou adicionar a String: Morango");

        try {
            collectionSet.add("Morango");
            collectionSet.forEach(System.out::println);
        } catch (UnsupportedOperationException e) {
            System.out.println("Deu erro :'( UnsupportedOperationException");
        }

        try {
            var collectionMap = Map.of(1, "Casa", 2, "Carro", 3, "Piscina");
            collectionMap.forEach((k, v) -> System.out.println("Chave : " + k + " " + " Valor: " + v));

            System.out.println("\n Vou tentar adicionar a String Gato");
            collectionMap.put(4, "Gato");
        } catch (UnsupportedOperationException e) {
            System.out.println("Deu erro :'( UnsupportedOperationException");
        }

    }
}
