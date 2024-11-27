package model;

public class Usuario {
    private String nome;
    private String tipo;

    public Usuario(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void emprestarLivro(Livro livro) {
        if (!livro.isEmprestado()) {
            livro.emprestar();
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro já está emprestado!");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
    }
}