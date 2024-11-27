package model;

public class Livro {
    private String titulo;
    private String autor;
    private LivroCategoria categoria;
    private boolean emprestado;

    public Livro(String titulo, String autor, LivroCategoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LivroCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(LivroCategoria categoria) {
        this.categoria = categoria;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }
}