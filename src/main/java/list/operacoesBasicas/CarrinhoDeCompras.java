package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!listaItens.isEmpty()) {
            for (Item i : listaItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia.");
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaItens.isEmpty()) {
            for (Item item : listaItens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirItens(){
        if(!listaItens.isEmpty()){
            System.out.println(this.listaItens);
        }else{
            System.out.println("A lista está vazia.");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItens=" + listaItens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Bola",25d,1);
        carrinhoDeCompras.adicionarItem("Chuteira",255d,1);
        carrinhoDeCompras.adicionarItem("Meião",30d,1);

        //exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // removendo itens do carrinho
        //carrinhoDeCompras.removerItem("Bola");

        //exibindo itens atualizado
        carrinhoDeCompras.exibirItens();

        //mostrando o valor total da lista
        System.out.println("Valor total no carrinho:" + carrinhoDeCompras.calcularValorTotal());
    }
}
