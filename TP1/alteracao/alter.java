import java.util.Random;

class alter {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Random gerador = new Random();
        gerador.setSeed(4);
        MyIO my = new MyIO();
        int tamanho;
        String frase = my.readLine();
        while (!(frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M')) {
            tamanho = frase.length();
            my.println(cifra(frase, tamanho, gerador));
            frase = my.readLine();
        }
    }

    public static String cifra(String frase, int tamanho, Random gerador) {
        String resp = "";
        char orig = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        char troca = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        for (int x = 0; x < tamanho; x++) {
            char tempC;
            int tempI;
            if (frase.charAt(x) == orig) {
                tempC = troca;
                tempI = tempC;
                tempC = (char) tempI;
                resp += tempC;
            } else {
                resp += frase.charAt(x);
            }
        }
        return resp;
    }
}
