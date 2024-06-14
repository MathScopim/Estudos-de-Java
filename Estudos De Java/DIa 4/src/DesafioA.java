public class DesafioA {
    public static void main(String[] args) {
                int numeroMaximo = 51;
                int numeroInicial = 0;

                for (int i = 0; numeroInicial < numeroMaximo; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                        numeroInicial++;
                    }
                }
    }
}