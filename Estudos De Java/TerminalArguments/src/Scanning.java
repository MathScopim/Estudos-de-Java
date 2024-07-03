import java.util.Locale;
import java.util.Scanner;

public class Scanning {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite Sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite Seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome;  ");
            String sobrenome = scanner.next();

            System.out.println("Digite Sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Olha me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");

        }
}
