package Model;

public class Produtos {
    private int Id;
    private String Nome;
    private String Descricao;
    private double preco;

    public Produtos() {}

    public Produtos(int id, String nome, String descricao, double preco) {
        Id = id;
        Nome = nome;
        Descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "Id='" + Id + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
