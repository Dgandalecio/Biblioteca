import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Publicacao> publicacoes;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacoes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarPublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(Publicacao publicacao, Usuario usuario, Date dataEmprestimo) {
        if (!verificarUsuario(usuario)) {
            System.out.println("Usuário não cadastrado na biblioteca.");
            return;
        }

        if (publicacaoDisponivel(publicacao)) {
            Emprestimo emprestimo = new Emprestimo(publicacao, usuario, dataEmprestimo);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("A publicação selecionada não está disponível para empréstimo.");
        }
    }

    private boolean verificarUsuario(Usuario usuario) {
        return usuarios.contains(usuario);
    }

    private boolean publicacaoDisponivel(Publicacao publicacao) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getPublicacao().equals(publicacao) && emprestimo.getDataDevolucao() == null) {
                return false; 
            }
        }
        return true; 
    }

    public void realizarDevolucao(Publicacao publicacao, Usuario usuario, Date dataDevolucao) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getPublicacao().equals(publicacao) && emprestimo.getUsuario().equals(usuario) && emprestimo.getDataDevolucao() == null) {
                emprestimo.setDataDevolucao(dataDevolucao);
                System.out.println("Devolução realizada com sucesso.");
               
                double multa = calcularMulta(emprestimo);
                if (multa > 0) {
                    System.out.println("Multa gerada: R$ " + multa);
                }
                return;
            }
        }
        System.out.println("Não foi possível realizar a devolução.");
    }

    private double calcularMulta(Emprestimo emprestimo) {
        int renovacoes = emprestimo.getRenovacoes();
        Publicacao publicacao = emprestimo.getPublicacao();
        return publicacao.calcularMulta(renovacoes);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", publicacoes=" + publicacoes +
                ", usuarios=" + usuarios +
                ", emprestimos=" + emprestimos +
                '}';
    }
}
