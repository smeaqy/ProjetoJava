package service;

import model.Livro;
import model.Usuario;
import model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public BibliotecaService() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        if (!livro.isEmprestado()) {
            Emprestimo emprestimo = new Emprestimo(usuario, livro);
            emprestimos.add(emprestimo);
            usuario.emprestarLivro(livro);
        } else {
            System.out.println("Não é possível emprestar, o livro já está emprestado.");
        }
    }

    public void mostrarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            emprestimo.mostrarEmprestimo();
        }
    }
}