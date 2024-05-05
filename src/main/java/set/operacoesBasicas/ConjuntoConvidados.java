package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite ){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
       ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados!");

        conjuntoConvidados.adicionarConvidado("Convidado 1 ", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2 ",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);
        conjuntoConvidados.adicionarConvidado("Convidado 5",1238);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados!");
        // removendo convidados pelo codigo do convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1238);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados!");
        //exibindo a lista de convidados
        conjuntoConvidados.exibirConvidados();

    }
}
