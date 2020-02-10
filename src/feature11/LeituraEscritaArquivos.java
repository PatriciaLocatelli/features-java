/**
 * https://www.zup.com.br/blog/java-11-principais-novidades
 */
package feature11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LeituraEscritaArquivos {
    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("teste", ".txt"), "Estou testando o arquivo");
        String frase = Files.readString(path);
        System.out.println(frase);
    }
}
