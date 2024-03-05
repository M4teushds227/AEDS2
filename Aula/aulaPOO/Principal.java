public class Principal {
    public static void main(String[] args){
        MeioPagamento pagamento[] = new MeioPagamento[3];
        pagamento[0] = new Dinheiro();
        pagamento[1] = new Pix();
        pagamento[2] = new Dinheiro();

        pagamento[0].setValor(1500);
        pagamento[1].setValor(2500);
        pagamento[2].setValor(3500);
        
        for(MeioPagamento x : pagamento){
            MyIO.println(x.mensagemValor());
        }
    }
}
