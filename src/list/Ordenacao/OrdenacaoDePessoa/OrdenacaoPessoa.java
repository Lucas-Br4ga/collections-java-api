package list.Ordenacao.OrdenacaoDePessoa;

import java.io.PipedWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList = new ArrayList<>();

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        if (pessoaList.isEmpty()) {
            return null;
        }
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        if (pessoaList.isEmpty()) {
            return null;
        }
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new OrdenarPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Lucas",20,1.79);
        ordenacaoPessoa.adicionarPessoa("julia",19,1.60);
        ordenacaoPessoa.adicionarPessoa("sol",50,1.70);
        ordenacaoPessoa.adicionarPessoa("marcinho",45,1.72);
        System.out.println("========== NADA ==========");
        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println("========== ALTURA ==========");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println("========== IDADE ==========");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}
