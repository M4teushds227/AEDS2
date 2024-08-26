public class palinR {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        MyIO my = new MyIO();
        String frase = my.readLine();
        int tamanho;
        while (!(frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M')) {
            tamanho = frase.length();
            if (palin(0, frase, tamanho, true)) {
                my.println("SIM");
            } else {
                my.println("NAO");
            }
            frase = my.readLine();  

        }

    }

    public static boolean palin(int x, String frase, int tamanho, boolean resp) {
        if (x < tamanho / 2) {
            if (frase.charAt(x) == frase.charAt(tamanho - x - 1)) {
                resp = palin(x + 1, frase, tamanho, resp);
            } else {
                resp = false;
            }
        }
        return resp;
    }

}
