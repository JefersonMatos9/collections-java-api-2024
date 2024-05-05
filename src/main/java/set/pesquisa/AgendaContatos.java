package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
        public void adicionarContato(String nome, int numero){
            contatoSet.add(new Contato(nome,numero));
        }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
       return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome,int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Jeferson Matos",123456);
        agendaContatos.adicionarContato("Jeferson Santos", 12345);
        agendaContatos.adicionarContato("Camila",252525);
        agendaContatos.adicionarContato("Camila",254214);
        agendaContatos.adicionarContato("Josiane",284214);

        agendaContatos.exibirContatos();

        //pesquisando pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        //adicionando um novo numero ao contato
        agendaContatos.atualizarNumeroContato("Camila",123);

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));


    }
}

