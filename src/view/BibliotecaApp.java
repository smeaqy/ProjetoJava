package view;

import model.Livro;
import model.LivroCategoria;
import model.Usuario;
import service.BibliotecaService;

public class BibliotecaApp {
    public static void main(String[] args) {
        BibliotecaService service = new BibliotecaService();

        // Criando livros
        Livro livro1 = new Livro("Java para Iniciantes", "Autor A", LivroCategoria.NAO_FICCAO);
        Livro livro2 = new Livro("Aventura no Mundo", "Autor B", LivroCategoria.FICCAO);

        // Criando usuários
        Usuario usuario1 = new Usuario("Maria", "Aluno");
        Usuario usuario2 = new Usuario("João", "Professor");

        // Adicionando ao sistema
        service.adicionarLivro(livro1);
        service.adicionarLivro(livro2);
        service.adicionarUsuario(usuario1);
        service.adicionarUsuario(usuario2);

        // Realizando empréstimos
        service.realizarEmprestimo(usuario1, livro1);
        service.realizarEmprestimo(usuario2, livro2);

        // Mostrando todos os empréstimos
        service.mostrarEmprestimos();
    }
}