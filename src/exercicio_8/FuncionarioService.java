package exercicio_8;

public class FuncionarioService {

    public Desenvolvedor promoverParaDesenvolvedor(Estagiario estagiario){
         if(estagiario instanceof Estagiario){
             return new Desenvolvedor(estagiario.getNome(), estagiario.getSalario()*1.5, estagiario.getValeAlimentacaoDia());
         }
        throw new IllegalArgumentException("Só é possível promover estagiários para desenvolvedor.");
    }

    public Gerente promoverParaGerente(Desenvolvedor desenvolvedor) {
        if(desenvolvedor instanceof Desenvolvedor){
            return new Gerente(desenvolvedor.getNome(), desenvolvedor.getSalario()*1.5);
        }
        throw new IllegalArgumentException("Só é possível promover estagiários para desenvolvedor.");
    }
}
