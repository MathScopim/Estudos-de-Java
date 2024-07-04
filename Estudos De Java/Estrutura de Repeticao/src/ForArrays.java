public class ForArrays {
    public static void main(String[] args) {
        String alunos [] = { "Felipe", "João", "Luciano", "Sergio"};

        //for (int x=0; x<alunos.length; x++) {
        //    System.out.println("O aluno no indicido x= " + x + " é " + alunos[x]);

            for(String aluno : alunos) {
                System.out.println("Nome do aluno : " + aluno);
            }

        }

    }

