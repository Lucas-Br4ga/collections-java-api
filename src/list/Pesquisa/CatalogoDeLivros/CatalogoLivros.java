package list.Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if (livroList.isEmpty()) {
            return null;
        }
        List<Livro> livroselct = new ArrayList<>();
        for (Livro livro : livroList) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livroselct.add(livro);
            }
        }
        return livroselct;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (livroList.isEmpty()) {
            return null;
        }
        List<Livro> livrosIntervalo = new ArrayList<>();
        for (Livro livro : livroList) {
            if ((livro.getAno() >= anoInicial) && (livro.getAno() <= anoFinal)) {
                livrosIntervalo.add(livro);
            }
        }
        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (livroList.isEmpty()) {
            return null;
        }
        Livro livroPorTitulo = null;
        for (Livro livro : livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = livro;
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1",2020);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2",2021);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3",2022);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4",2023);
        catalogoLivros.adicionarLivro("Livro 5","Autor 5",2024);

        System.out.println("===========================");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
        System.out.println("===========================");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
        System.out.println("===========================");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2021,2023));
    }
}