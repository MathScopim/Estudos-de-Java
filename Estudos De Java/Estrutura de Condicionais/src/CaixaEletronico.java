public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 127.0;
        // Simples
        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        System.out.println(saldo); }
        // Se houver else não ira ser mais um Condicional Simples
        else
        System.out.println("Saldo insuficiente");
    }
}
