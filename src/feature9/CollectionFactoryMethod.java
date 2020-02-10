/**
 * https://www.programadorfeirense.com.br/blog/artigos/novidades-do-java-9
 */
package feature9;

import java.util.List;
import java.util.Set;

public class CollectionFactoryMethod {
    public static void main(String[] args) {
        Set<Integer> setInteiros = Set.of(1, 2, 3, 4, 5);
        List<String> listaStrings= List.of("a", "b", "c", "d", "e");

        setInteiros.forEach(System.out::println);
        listaStrings.forEach(System.out::println);
    }
}
