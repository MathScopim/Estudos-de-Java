import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return convidadoSet.size();
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set de convidados" );

        conjuntoConvidados.adicionarConvidado("Convidado 1",1332);
        conjuntoConvidados.adicionarConvidado("Convidado 2",1211);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1723);
        conjuntoConvidados.adicionarConvidado("Convidado 4",7888);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1332);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set de convidados");


    }
}
