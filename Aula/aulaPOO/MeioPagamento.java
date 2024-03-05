import javax.xml.crypto.Data;

public abstract class MeioPagamento {
    private double valor;
    private Data vencimento;
    
    abstract String mensagemDesconto();

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        if(valor >= 0 ) this.valor = valor;
    }

    public void zeraPagamento(){
        this.valor = 0;
    }

    public String mensagemValor(){
        String resp = "RS : " + valor;
        return resp;
    }
}
