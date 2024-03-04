class cifra {
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
                    resp = cesar(palavra,tamanho);
                    my.println(resp);
                }
            }
        }

    }

        public static String cesar(String palavra, int tamanho){
            String resp = "";
            char temp;
                    int a;
                    for (int x = 0; x < tamanho; x++) {
                        temp = palavra.charAt(x);
                        a = temp + 3;
                        temp = (char) a;
                        resp += temp;
                    }
            return resp;
        }
}
