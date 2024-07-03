public class SchoolResult {
    public static void main(String[] args) {
        //Condicional Composta
        int nota = 5;

        if(nota >= 7)
            System.out.println("Aprovado");
          else if(nota >= 5 && nota < 7)
                System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}
