import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.Locale;

import static java.util.Locale.filter;

public class PredicateExample {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);

    }
}
