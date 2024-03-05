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
            if (frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M') {
                i = false;
            } else {
                x1 = verV(frase, tamanho);
                x2 = verC(frase, tamanho);
                x3 = verNi(frase, tamanho);
                x4 = verNr(frase, tamanho);

                if (x1) {
                    my.print("SIM ");
                } else {
                    my.print("NAO ");
                }
                if (x2) {
                    my.print("SIM ");
                } else {
                    my.print("NAO ");
                }
                if (x3) {
                    my.print("SIM ");
                } else {
                    my.print("NAO ");
                }
                if (x4) {
                    my.println("SIM");
                } else {
                    my.println("NAO");
                }

            }

        }
    }

    static boolean verV(String f, int tamanho) {
        boolean resp = true;
        for (int x = 0; x < tamanho; x++) {
            if (((int) f.charAt(x)) == 'a' || f.charAt(x) == 'e' || f.charAt(x) == 'i' || f.charAt(x) == 'o'
                    || f.charAt(x) == 'u' || f.charAt(x) == 'A' || f.charAt(x) == 'E' || f.charAt(x) == 'I'
                    || f.charAt(x) == 'O' || f.charAt(x) == 'U') {
            } else {
                x = tamanho;
                resp = false;
            }
        }
        return resp;
    }

    static boolean verC(String f, int tamanho) {
        boolean resp = true;
        for (int x = 0; x < tamanho; x++) {
            if (((f.charAt(x) >= 'a' && f.charAt(x) <= 'z') || (f.charAt(x) >= 'B' && f.charAt(x) <= 'Z'))
                    && !(((int) f.charAt(x)) == 'a' || f.charAt(x) == 'e' || f.charAt(x) == 'i' || f.charAt(x) == 'o'
                            || f.charAt(x) == 'u' || f.charAt(x) == 'A' || f.charAt(x) == 'E' || f.charAt(x) == 'I'
                            || f.charAt(x) == 'O' || f.charAt(x) == 'U')) {
            } else {
                x = tamanho;
                resp = false;
            }
        }
        return resp;
    }

    static boolean verNi(String f, int tamanho) {
        boolean resp = true;
        for (int x = 0; x < tamanho; x++) {
            if (((int) f.charAt(x)) < 48 || ((int) f.charAt(x)) > 57) {
                resp = false;
                x = tamanho;
            }
        }

        return resp;
    }

    static boolean verNr(String f, int tamanho) {
        boolean resp = false;
        int verP = 0;
        for (int i = 0; i < tamanho; i++) {
            if (f.charAt(i) == ',' || f.charAt(i) == '.') {
                i = tamanho;
                for (int x = 0; x < tamanho; x++) {
                    resp = true;
                    if (f.charAt(x) == 44 || f.charAt(x) == 46) {
                        if(verP == 0){
                            verP ++;
                        }else{
                            x = tamanho;
                            resp = false;
                        }
                    } else {
                        if (f.charAt(x) >= 48 && f.charAt(x) <= 57) {
                        } else {
                            x = tamanho;
                            resp = false;
                        }
                    }
                }
            }
        }
        return resp;
    }
}
