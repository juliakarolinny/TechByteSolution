package Controller;

import Model.GerenciamentoService;

import java.util.List;

public class GerenciamentoController {
    private final GerenciamentoService gerenciamentoService;

    public GerenciamentoController(GerenciamentoService gerenciamentoService) {
        this.gerenciamentoService = gerenciamentoService;
    }
    public void cadastrar(){
        gerenciamentoService.cadastrarGerenciador("Julia","jualia@gamil.com");
    }
    public List<?> mostrar(){
        return gerenciamentoService.mostrar();
    }

    public void remover(int id){
        gerenciamentoService.removerGerenciadorId(id);
    }
    public void atualizar(int id, String nome){
        gerenciamentoService.atualizarGerenciador(id,nome);
    }

}