import java.util.Scanner;

public class DesafioDia1 {
    public static void main(String[] args) {
    Scanner primeiroNumeroScanner = new  Scanner(System.in);
    Scanner segundoNumeroScanner = new  Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        long primeiroNumero = primeiroNumeroScanner.nextLong();
        System.out.println(primeiroNumero);
        System.out.println("Digite um segundo número: ");
        long segundoNumero = segundoNumeroScanner.nextLong();
        System.out.println(segundoNumero);
        System.out.println("A soma desses números é: ");
        System.out.println(primeiroNumero + segundoNumero);
    }
}
