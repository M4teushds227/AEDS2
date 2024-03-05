public class Dinheiro extends MeioPagamento {

    @Override
    public String mensagemValor() {
        return "Pagamento via pix : " + super.mensagemValor();
    }

    @Override
    String mensagemDesconto() {
        return "pagando em dinheiro com desconto";
    }

}
