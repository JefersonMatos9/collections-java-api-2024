package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTerefas = new ListaTarefas();

        listaTerefas.adicionarTarefa("Tarefa 1");
        listaTerefas.adicionarTarefa("Tarefa 1");
        listaTerefas.adicionarTarefa("Tarefa 2");

        System.out.println("Numero total de elementos na lista:" + listaTerefas.obterNumeroTotalTarefas());


        listaTerefas.removerTarefa("Tarefa 2");
        System.out.println("Numero total de elementos na lista:" + listaTerefas.obterNumeroTotalTarefas());
        
        listaTerefas.obterDescricoesTarefas();
    }
}
