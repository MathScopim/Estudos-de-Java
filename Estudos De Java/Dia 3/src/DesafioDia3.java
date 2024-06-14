import java.util.Scanner;

public class DesafioDia3 {
    public static void main(String[] args) {
       Scanner Digitos = new Scanner(System.in);
        System.out.print("Digite um número : ");
        int num = Digitos.nextInt();

        if (num <9 && num>=1) {
            System.out.println("Este número tem 1 Digitos");
        }
        else if (num <100 && num>=10) {
            System.out.println("Este número tem 2 Digitos");
        }
        else if (num <1000 && num>=100) {
            System.out.println("Este número tem 3 Digitos");
        }
        else if (num <10000 && num>=1000) {
            System.out.println("Este número tem 4 Digitos");
        }
        else if (num <100000 && num>=10000) {
            System.out.println("Este número tem 5 Digitos");
        }
        else
            System.out.println("Este número tem mais de 5 Digitos");


    }
}
