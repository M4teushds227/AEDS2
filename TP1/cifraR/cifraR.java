class cifraR {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        MyIO my = new MyIO();
        boolean i = true;
        int tamanho;
        String palavra;
        while (i) {
            palavra = my.readLine();
            tamanho = palavra.length();
            if (tamanho > 0) {
                if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
                    i = false;
                } else {
                    String resp = "";
                    resp = cesar(palavra,tamanho,"",0);
                    my.println(resp);
                }
            }
        }

    }

        public static String cesar(String palavra, int tamanho,String resp,int x){
            char temp;
                    int a;
                    if (x < tamanho) {
                        temp = palavra.charAt(x);
                        a = temp + 3;
                        temp = (char) a;
                        resp += temp;
                        resp = cesar(palavra, tamanho, resp, x + 1);
                    }else{
                        return resp;
                    }
            return resp;
        }
}
