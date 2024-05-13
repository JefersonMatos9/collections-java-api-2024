package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Deco", 125454);
        agendaContatos.adicionarContato("Miguel", 4547);
        agendaContatos.adicionarContato("Josiane", 44577);
        agendaContatos.adicionarContato("Marly", 4544455);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Deco");

        agendaContatos.exibirContato();

        System.out.println("O numero é" + agendaContatos.pesquisarPorNome("Josiane"));
    }
}
