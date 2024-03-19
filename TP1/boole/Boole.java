public class Boole {
    public static void main(String[] args) {
        char a,b,c;
        boolean p = true;
        while (p) {        
            String entrada;
            String operacao = "";
            entrada = MyIO.readLine();
                if(entrada.charAt(0) != '0'){
                a = entrada.charAt(2);
                b = entrada.charAt(4);
                c = entrada.charAt(6);
                    //and ~ apareceu 0 = 0
                    //or ^ apareceu 1 = 1
                    //not ! nega o valor
                for(int i = 0 ; i < entrada.length();i++){
                    if((entrada.charAt(i) >= 48 && entrada.charAt(i) <= 57) || entrada.charAt(i) == ' ' || entrada.charAt(i) == '(' || entrada.charAt(i) == ')' || entrada.charAt(i) == ','){
                    }else if (entrada.charAt(i) == 'A') {
                        operacao += a;
                    }else if (entrada.charAt(i) == 'B') {
                        operacao += b;
                    }else if (entrada.charAt(i) == 'C') {
                        operacao += c;
                    }else{
                        operacao += entrada.charAt(i);
                    }
                }
                for(int i = 0; i < operacao.length();){
                    if(operacao.charAt(i) == 'o'){

                    }
                }
                System.out.println(operacao);
            }else{
                p = false;
            }
        }
    }
}
