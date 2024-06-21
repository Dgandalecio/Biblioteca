import java.util.List;

public class Artigo extends Publicacao {
    private String resumo;

    public Artigo(String titulo, String dataPublicacao, List<Autor> autores, String resumo) {
        super(titulo, dataPublicacao, autores);
        this.resumo = resumo;
    }

    @Override
    public double calcularMulta(int renovacoes) {
   
        return 5.0 * renovacoes; 
    }

   
    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "resumo='" + resumo + '\'' +
                "} " + super.toString();
    }
}
