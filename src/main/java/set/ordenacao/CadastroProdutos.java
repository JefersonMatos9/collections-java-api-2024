package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos implements Comparable<Produto>{
    @Override
    public int compareTo(Produto p) {
        String nome = null;
        return nome.compareToIgnoreCase(p.getNome());
    }

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod,String nome,double preco,int quantidade){
        produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(1L,"Produto 1",15d,5);
        cadastro.adicionarProduto(2L,"Produto 2",20d,10);
        cadastro.adicionarProduto(1L,"Produto 3",5d,2);
        cadastro.adicionarProduto(7L,"Produto 10",15d,5);

        //System.out.println(cadastro.produtoSet);

        //System.out.println(cadastro.exibirProdutosPorNome());

        System.out.println(cadastro.exibirProdutosPorPreco());




    }

    }


