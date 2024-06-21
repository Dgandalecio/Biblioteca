import java.util.List;

public class Livro extends Publicacao {
    private int numeroEdicao;
    private String nomeEditora;
    private String isbn;

    public Livro(String titulo, String dataPublicacao, List<Autor> autores, int numeroEdicao, String nomeEditora, String isbn) {
        super(titulo, dataPublicacao, autores);
        this.numeroEdicao = numeroEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }

    @Override
    public double calcularMulta(int renovacoes) {
        
        return 10.0 * renovacoes; 
    }

   
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroEdicao=" + numeroEdicao +
                ", nomeEditora='" + nomeEditora + '\'' +
                ", isbn='" + isbn + '\'' +
                "} " + super.toString();
    }
}
