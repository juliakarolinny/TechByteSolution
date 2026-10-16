package Model;

import java.util.ArrayList;
import java.util.List;

public class ProdutosService {
    private static int id = 1;
    private final GerenciamentoService gerenciamentoService;
    List<Produtos> inventario = new ArrayList<>();

    public ProdutosService(GerenciamentoService gerenciamentoService) {
        this.gerenciamentoService = gerenciamentoService;

    }

    public void cadastrarProdutos (String nome, String descricao, double preco) {
        Produtos produtos = new Produtos( id++,nome,descricao,preco );
        inventario.add(produtos);

    }
    public List<Produtos> getInventario() {
        return inventario;
    }

    public Produtos buscarProdutos(int id) {
        for (Produtos p : inventario) {
            if (p.getId() == id) {
                return p;

            }
        }
        return null;
    }
    public void removerProdutos (int id) {
        for(Produtos p : inventario){
            if(p.getId() == id){
                inventario.remove(p);
                IO.println("Produto removido com sucesso!");
            }
        }
    }
    public void atualizarProdutos(int id, String nome, String descricao, double preco) {
        for(Produtos p : inventario){
            if(p.getId() == id){
                p.setNome(nome);
                IO.println("Produto atualizado com sucesso!");
            }
        }
    }

}
