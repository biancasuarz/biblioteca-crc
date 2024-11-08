package biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponibilidade;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

  public boolean isDisponibilidade() {
        return disponibilidade;
  }

  public void alterarDisponilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
  }

}


