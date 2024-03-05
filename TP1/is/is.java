class is {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        MyIO my = new MyIO();
        boolean i = true, x1, x2, x3, x4;
        String frase;
        int tamanho;
        while (i) {
            frase = my.readLine();
            tamanho = frase.length();
            try {
                if (frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M') {
                    i = false;
                } else {
                    x1 = verV(frase,tamanho);
                    x2 = verC(frase,tamanho);
                    x3 = verNi(frase,tamanho);
                }
            } catch (Exception e) {

            }
        }
    }

    static boolean verV(String f, int tamanho) {
        boolean resp = true;
        tamanho = f.length();
        for (int x = 0; x < tamanho; x++) {
            if (f.charAt(x) == 'a' || f.charAt(x) == 'e' || f.charAt(x) == 'i' || f.charAt(x) == 'o'
                    || f.charAt(x) == 'u' || f.charAt(x) == 'A' || f.charAt(x) == 'E' || f.charAt(x) == 'I'
                    || f.charAt(x) == 'O' || f.charAt(x) == 'U') {
            } else {
                resp = false;
            }
        }
        return resp;
    }

    static boolean verC(String f,int tamanho) {
        boolean resp = true;
        for (int x = 0; x < tamanho; x++) {
            if (!(verV(f,tamanho)) && f.charAt(x) >= 'b' && f.charAt(x) <= 'z' && f.charAt(x) >= 'B' && f.charAt(x) <= 'Z') { 
            } else {
                resp = false;
            }
        }
        return resp;
    }

    static boolean verNi(String f,int tamanho){
        boolean resp = true;
        


        
        return resp;
    }
}
