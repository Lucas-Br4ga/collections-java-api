package list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numero;

    public SomaNumeros() {
        this.numero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numero.add(numero);
    }

    public int calcularSoma() {
        if (this.numero.isEmpty()) {
            return 0;
        }
        int soma = 0;
        for (Integer integer : this.numero) {
            soma = integer.intValue();
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        if (this.numero.isEmpty()) {
            return 0;
        }
        int maiorNumero = 0;
        for (Integer integer : this.numero) {
            if (maiorNumero < integer.intValue()) {
                maiorNumero = integer.intValue();
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        if (this.numero.isEmpty()) {
            return 0;
        }
        int menornumero = this.numero.get(0);
        for (Integer integer : this.numero) {
            if (menornumero
         > integer.intValue()) {
                menornumero
         = integer.intValue();
            }
        }
        return menornumero
        ;
    }
    public void exibirNumeros() {
        System.out.println(this.numero);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.exibirNumeros();
        System.out.println("O Maior número e? " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O Menor número e? " + somaNumeros.encontrarMenorNumero());
    }
}
