package vendasJDBC;

public class Vendas {

    private int id;
    private String descricao;
    private int quantidade;
    private String cliente;

    public Vendas(int id, String descricao, int quantidade, String cliente) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.cliente = cliente;
    }

    public Vendas(String descricao, int quantidade, String cliente) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "vendas.Vendas{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
