import java.util.Random;

class alter {   
    @SuppressWarnings("static-access")
    public static void main (String[] args){
        MyIO my = new MyIO();
        int tamanho;
        boolean i = true;
        String frase;
        Random gerador = new Random();
        gerador.setSeed(4);
        while (i) {
            frase = my.readLine();
            tamanho = frase.length();

            if(frase.charAt(0)=='F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M'){
                i = false;
            }else{
                String resp ="";
                char orig = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
                char  troca= (char)('a' + (Math.abs(gerador.nextInt()) % 26));
                for(int x = 0; x < tamanho;x++){
                    char tempC;
                    int tempI;
                    if(frase.charAt(x) == orig ){
                        tempC = troca;
                        tempI = tempC;
                        tempC = (char) tempI;
                        resp += tempC;
                    }else{
                        resp += frase.charAt(x);
                    }
                }
                my.println(resp);
            }
            
        }
    }
}
