package exercicio_7;

public class ProcessarPagamentos {
    public static void main(String[] args) {

        try{
            Boleto boleto1 = new Boleto(8);
            boleto1.processarPagamento(500.00);
            // Gerando exceção para prazo inferior ao minimo estabelecido (7 dias)
            Boleto boleto2 = new Boleto(6);
            boleto2.processarPagamento(150.00);

        } catch (Exception e){
            System.out.println("ERRO NO PROCESSAMENTO: " + e.getMessage());
        }

        CartaoDeCredito cartao1 = new CartaoDeCredito(500.00);
        try{
            cartao1.setDesbloqueado(true);
            cartao1.processarPagamento(400.00);
            // Gerando exception para cartão bloqueado
            cartao1.setDesbloqueado(false);
            cartao1.processarPagamento(50.00);
        } catch (Exception e){
            System.out.println("ERRO NO PROCESSAMENTO: " + e.getMessage());
        }
        try{
            // Gerando exception para falta de limite
            cartao1.setDesbloqueado(true);
            cartao1.processarPagamento(150.00);
        } catch (Exception e) {
            System.out.println("ERRO NO PROCESSAMENTO: " + e.getMessage());
        }

        Pix pix = new Pix("000.111.222-33");
        try{
            // Pix realizado com chave habilitada:
            pix.setHabilitada(true);
            pix.processarPagamento(40.00);
            // O proximo pix não será processado e deverá gerar uma exception pois a chave não estará habilitada
            pix.setHabilitada(false);
            pix.processarPagamento(80.00);
        }catch (Exception e) {
            System.out.println("ERRO NO PROCESSAMENTO: " + e.getMessage());
        }

    }
}
