import java.util.ArrayList;
import java.util.List;

public abstract class Publicacao {
    private String titulo;
    private String dataPublicacao;
    private List<Publicacao> referencias;
    private List<Autor> autores;

    public Publicacao(String titulo, String dataPublicacao, List<Autor> autores) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.autores = autores;
        this.referencias = new ArrayList<>();
    }

    
    public abstract double calcularMulta(int renovacoes);

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Publicacao> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Publicacao> referencias) {
        this.referencias = referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "titulo='" + titulo + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", referencias=" + referencias +
                ", autores=" + autores +
                '}';
    }
}
