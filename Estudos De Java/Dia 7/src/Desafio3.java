
    import java.util.*;
    public class Desafio3 {
        public static void main(String[] args) {
            System.out.print("Digite o número1 operador número2 (2 * 4): ");

            Scanner s = new Scanner(System.in);
            double n1 = s.nextDouble();
            char ope = s.next().charAt(0);
            double n2 = s.nextDouble();

            if(ope == '+')
                System.out.println((int) n1 + n2);
            else if(ope == '-')
                System.out.println((int) n1 - n2);
            else if(ope == '*')
                System.out.println((int) n1 * n2);
            else if(ope == '/')
                System.out.println(n1 / n2);
            else
                System.out.println("Formato invalido!");




        }
    }

