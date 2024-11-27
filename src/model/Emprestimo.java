package model;

import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(14); // devolução em 14 dias
    }

    public void mostrarEmprestimo() {
        System.out.println("Emprestado para: " + usuario.getNome() + " | Livro: " + livro.getTitulo());
        System.out.println("Data de empréstimo: " + dataEmprestimo + " | Data de devolução: " + dataDevolucao);
    }
}