class cifra {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        MyIO my = new MyIO();
        int tamanho;
        String palavra;
        palavra = my.readLine();
        while (!(palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M')) {
            tamanho = palavra.length();
            String resp = "";
            resp = cesar(palavra, tamanho);
            my.println(resp);
            palavra = my.readLine();
        }

    }

    public static String cesar(String palavra, int tamanho) {
        String resp = "";
        int a;
        for (int x = 0; x < tamanho; x++) {
            char temp = palavra.charAt(x);
            a = temp + 3;
            temp = (char) a;
            resp += temp;
        }
        return resp;
    }
}
