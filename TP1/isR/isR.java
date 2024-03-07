class isR {
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
                x1 = verV(frase, tamanho, true, 0);
                x2 = verC(frase, tamanho, true, 0);
                x3 = verNi(frase, tamanho, true, 0);
                x4 = verNr(frase, tamanho, true, 0, 0);

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

    static boolean verV(String f, int tamanho, boolean resp, int x) {
        if (x < tamanho) {
            if (((int) f.charAt(x)) == 'a' || f.charAt(x) == 'e' || f.charAt(x) == 'i' || f.charAt(x) == 'o'
                    || f.charAt(x) == 'u' || f.charAt(x) == 'A' || f.charAt(x) == 'E' || f.charAt(x) == 'I'
                    || f.charAt(x) == 'O' || f.charAt(x) == 'U') {
                resp = verV(f, tamanho, resp, x + 1);
            } else {
                resp = false;
            }
        } else {
            return resp;
        }
        return resp;
    }

    static boolean verC(String f, int tamanho, boolean resp, int x) {
        if (x < tamanho) {
            if (((f.charAt(x) >= 'a' && f.charAt(x) <= 'z') || (f.charAt(x) >= 'B' && f.charAt(x) <= 'Z'))
                    && !(((int) f.charAt(x)) == 'a' || f.charAt(x) == 'e' || f.charAt(x) == 'i' || f.charAt(x) == 'o'
                            || f.charAt(x) == 'u' || f.charAt(x) == 'A' || f.charAt(x) == 'E' || f.charAt(x) == 'I'
                            || f.charAt(x) == 'O' || f.charAt(x) == 'U')) {
                resp = verC(f, tamanho, resp, x + 1);
            } else {
                resp = false;
            }
        } else {
            return resp;
        }
        return resp;
    }

    static boolean verNi(String f, int tamanho, boolean resp, int x) {
        if (x < tamanho) {
            if (((int) f.charAt(x)) >= 48 && ((int) f.charAt(x)) <= 57) {
                resp = verNi(f, tamanho, resp, x + 1);
            } else {
                resp = false;
            }
        } else {
            return resp;
        }
        return resp;
    }

    static boolean verNr(String f, int tamanho, boolean resp, int x, int verP) {
        if (verP < 2) {
            if (x < tamanho) {
                if (f.charAt(x) == ',' || f.charAt(x) == '.') {
                    resp = verNr(f, tamanho, resp, x + 1, verP + 1);
                } else {
                    if (f.charAt(x) >= 48 && f.charAt(x) <= 57) {
                        resp = verNr(f, tamanho, resp, x + 1, verP);
                    } else {
                        resp = false;
                    }
                }
            } else {
                return resp;
            }
        }else if( verP == 2){
            resp = false;
        }
        return resp;
    }
}
