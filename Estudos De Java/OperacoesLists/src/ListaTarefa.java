import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Lista> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Lista(descricao));
    }
    public void remnoverTarefa(String descricao) {
        List<Lista> tarefasParaRemover = new ArrayList<>();
        for(Lista t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.remnoverTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.obterDescricoesTarefas();


    }
}
