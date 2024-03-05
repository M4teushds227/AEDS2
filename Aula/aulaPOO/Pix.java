public class Pix extends MeioPagamento{
    
    private String chave;
    
    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    @Override
    public String mensagemValor(){
        return "Pagamento via pix : " + super.mensagemValor();
    }

    @Override
    String mensagemDesconto() {
        return "pagando com Pix com desconto";
    }

}
