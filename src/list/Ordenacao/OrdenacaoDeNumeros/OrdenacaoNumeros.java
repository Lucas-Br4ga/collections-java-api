package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numero;

    public OrdenacaoNumeros() {
        this.numero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numero.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        if (numero.isEmpty()) {
            return null;
        }
        List<Integer> numeroAscendente = new ArrayList<>(numero);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }

    public List<Integer> ordenarDescendente() {
        if (numero.isEmpty()) {
            return null;
        }
        List<Integer> numeroDescendente = new ArrayList<>(numero);
        numeroDescendente.sort(Collections.reverseOrder());
        return numeroDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(6);
        System.out.println("========== NADA ==========");
        System.out.println(ordenacaoNumeros.numero);
        System.out.println("========== Ascendente ==========");
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println("========== Descendente ==========");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
