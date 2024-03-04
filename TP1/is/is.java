class is {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        MyIO my = new MyIO();
        boolean i = true, x1, x2, x3, x4;
        String frase;
        while (i) {
            frase = my.readLine();
            try {
                if (frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M') {
                    i = false;
                } else {
                    x1 = verV(frase);
                }
            } catch (Exception e) {

            }
        }
    }

    static boolean verV(String f) {
        boolean resp = true;
        int tamanho;
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

    static boolean verC(String f) {
        boolean resp = true;
        int tamanho;
        tamanho = f.length();
        for (int x = 0; x < tamanho; x++) {
            if (!(verV(f)) && f.charAt(x) >= 'a' && f.charAt(x) <= 'z' && f.charAt(x) >= 'A' && f.charAt(x) <= 'Z') {
            } else {
                resp = false;
            }
        }
        return resp;
    }
}
