import java.util.Random;

class alter {   
    public static void main (String[] args){
        MyIO my = new MyIO();
        int tamanho;
        boolean i = true,resp;
        String frase;
        Random gerador = new Random();
        gerador.setSeed(4);
        char troca;
        tamanho = 1;
        while (tamanho < 4) {
            tamanho++;
            resp = true;
            troca = ((char)('a' + (Math.abs(gerador.nextInt()) % 26)));
            frase = my.readLine();
            tamanho = frase.length();

            if(frase.charAt(0)=='F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M'){
                i = false;
            }else{
                for(int x = 0; x < tamanho - 1;x++){
                    if(frase.charAt(x) == troca);
                }
            }
            
        }
    }
}
