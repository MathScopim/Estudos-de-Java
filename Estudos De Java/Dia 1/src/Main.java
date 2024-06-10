/// public class Main {
///    public static void main(String[] args) {
///        byte minhaIdade = 13;
///        int salarioMensal = 10_000;
///       double altura = 1.75;
///       char initial = 'm';
///        boolean eMaiorDeIdade = false;
///        System.out.println(minhaIdade);
///        System.out.println(salarioMensal);
//////////////////////////////////////////////
                    //2//
/////////////////////////////////////////////
///    }
/// }

// public class Main {
//    public static void main(String[] args) {
//       // Dados da pessoa
//        byte minhaIdade = 13;
//        String firstname = "matheus " + "Fonseca";
        // Imprimirá os dados acima

        // Escreva sout e clica Tab para criar um system out
//      System.out.println(minhaIdade);
//        System.out.println("hi");
//        System.out.println(firstname.toLowerCase());
//    }

// }
///////////////////////////////////////////
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner idadeScanner = new  Scanner(System.in);
        System.out.println("Digite A Sua Idade:");
        byte idadeCliente = idadeScanner.nextByte();
        System.out.println(idadeCliente);

    }
}
///