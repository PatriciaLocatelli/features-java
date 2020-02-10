/**
 * https://www.journaldev.com/13121/java-9-features-with-examples
 */
package feature9;

import java.util.stream.Stream;

public class StreamTakeWhile {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(i -> i <= 5).forEach(System.out::println);
    }
}
