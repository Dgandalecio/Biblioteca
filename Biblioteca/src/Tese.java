import java.util.Date;
import java.util.List;

public class Tese extends Publicacao {
    private Autor autorTese;
    private int numeroPaginas;
    private String resumo;
    private Date dataDefesa;
    private String instituicao;

    public Tese(String titulo, String dataPublicacao, List<Autor> autores, Autor autorTese, int numeroPaginas, String resumo, Date dataDefesa, String instituicao) {
        super(titulo, dataPublicacao, autores);
        this.autorTese = autorTese;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
    }

    @Override
    public double calcularMulta(int renovacoes) {
        
        return 8.0 * renovacoes; 
    }

 
    public Autor getAutorTese() {
        return autorTese;
    }

    public void setAutorTese(Autor autorTese) {
        this.autorTese = autorTese;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "Tese{" +
                "autorTese=" + autorTese +
                ", numeroPaginas=" + numeroPaginas +
                ", resumo='" + resumo + '\'' +
                ", dataDefesa=" + dataDefesa +
                ", instituicao='" + instituicao + '\'' +
                "} " + super.toString();
    }
}
