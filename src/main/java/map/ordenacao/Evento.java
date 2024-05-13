package map.ordenacao;

import java.util.Collection;
import java.util.Collections;

public class Evento {
    //atributo
    private String nome;
    private String atracao;

    public Evento(String nome,String atracao){
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome(){
        return nome;
    }

    public String getAtracao(){
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao=" + atracao +
                '}';
    }
}
