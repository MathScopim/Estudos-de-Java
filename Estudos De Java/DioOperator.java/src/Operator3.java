public class Operator3 {
    public static void main(String[] args) {
        String nomeUm = "Jacinto";
        String nomeDois = new String("Jailson");
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 83;
        int numero2 = 2;
        int soma = numero1 + numero2;

        if(numero1 > numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a numeroDois?" + " " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente a numeroDois?" + " " +simNao);

        simNao = numero1 > numero2;
        System.out.println("NumeroUm é maior a numeroDois?" + " " +simNao);

        simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor a numeroDois?" + " " +simNao);



    }
}
