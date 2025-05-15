package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> items;

    public CarrinhoCompras() {
        this.items = new ArrayList<>();
    }

    public void adcionarItem(String nome, double preco, int quantidade) {
        items.add(new Item(quantidade,preco,nome));
    }

    public void removerItem(String nome) {
        List<Item> removeItens = new ArrayList<>();
        for (Item item :items){
            if (item.getNome().equalsIgnoreCase(nome)) {
                removeItens.add(item);
            }
        }
        items.removeAll(removeItens);
    }
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : items) {
           valorTotal+=(item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }
    public void exibirItens() {
        System.out.println(items);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adcionarItem("refri",10.5,20);
        carrinho.exibirItens();
        System.out.println("====================");
        carrinho.adcionarItem("biscoito",25.5,40);
        carrinho.exibirItens();
        System.out.println("====================");
        carrinho.adcionarItem("agua",2.5,50);
        carrinho.exibirItens();
        System.out.println("====================");
        carrinho.removerItem("agua");
        carrinho.exibirItens();
        System.out.println("====================");
        System.out.println("O valor total é: " + carrinho.calcularValorTotal());
        System.out.println("====================");


    }
}
