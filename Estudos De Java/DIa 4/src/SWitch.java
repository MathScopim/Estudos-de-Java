import java.util.Scanner;

public class SWitch {
    public static void main(String[] args) {
        // Coletar o nome do produto
        System.out.print("Digite o nome do produto : ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();
        // Retornar o valor do produto

        switch (nomeProduto) {
            case "banana":
                System.out.println("R$3.77");
                break;
            case "manga":
                System.out.println("R$12.98");
                break;
            case "acerola":
                System.out.println("R$21.88");
                break;
            case "abóbora":
                System.out.println("R$7.32");
                break;
            case "pitaya":
                System.out.println("R$22.65");
        }
    }
}
