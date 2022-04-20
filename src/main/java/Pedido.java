import java.io.Serializable; //Para enviar algum arquivo precisa da interface serializable

public class Pedido implements Serializable  {

    private static final long serialVersionUID = 1L;

    private Long codigo;
    private String descricao;
    private int quantidade;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
