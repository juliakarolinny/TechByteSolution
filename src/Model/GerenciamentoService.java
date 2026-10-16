package Model;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoService {
    private static int id = 1;
    private final ProdutosService produtosService;
    List<Gerenciamento> inventario = new ArrayList<>();

    public GerenciamentoService(ProdutosService produtosService) {
        this.produtosService = produtosService;
    }

    public void cadastrarGerenciador(String nome, String email) {
        Gerenciamento gerenciamento = new Gerenciamento(nome, email);
        inventario.add(gerenciamento);
    }

    public List<Gerenciamento> getInventario() {
        return inventario;
    }

    public Gerenciamento buscarGerenciador(int id) {
        for (Gerenciamento g : inventario) {
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }
    public void removerGerenciadorId(int id) {
        for(Gerenciamento g : inventario) {
            if(g.getId() == id) {
                inventario.remove(g);
                IO.println(" Gerenciador Removido com sucesso!");
                break;
            }
        }
    }

    public void atualizarGerenciador(int id, String nome){
        for(Gerenciamento g : inventario){
            if(g.getId() == id){
                g.setNome(nome);
                IO.println(" Gerenciador Atualizado com sucesso!");
            }

        }
    }

}
