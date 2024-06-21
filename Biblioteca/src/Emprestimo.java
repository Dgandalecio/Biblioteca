import java.util.Date;

public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private int renovacoes;

    public Emprestimo(Publicacao publicacao, Usuario usuario, Date dataEmprestimo) {
        this.publicacao = publicacao;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.renovacoes = 0;
    }

    public void renovar() {
        if (renovacoes < 3) {
            renovacoes++;
            System.out.println("Empréstimo renovado com sucesso.");
        } else {
            System.out.println("Limite de renovações atingido. Não é possível renovar o empréstimo.");
        }
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "publicacao=" + publicacao +
                ", usuario=" + usuario +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", renovacoes=" + renovacoes +
                '}';
    }
}
