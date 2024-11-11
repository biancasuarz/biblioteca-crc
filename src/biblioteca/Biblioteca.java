package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> acervo;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Livro buscarLivro(String titulo) {
        return acervo.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

}


}
