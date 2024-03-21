public class Boole {
    public static void main(String[] args) {
        boolean p = true;
        while (p) {
            String entrada;
            String operacao;
            entrada = MyIO.readLine();
            if (entrada.charAt(0) != '0') {
                // and ~ apareceu 0 = 0
                // or ^ apareceu 1 = 1
                // not ! nega o valor
                operacao = trocarfrase(entrada);
                // System.out.println(operacao);
                verificar(operacao);
            } else {
                p = false;
            }
        }
    }

    static String trocarfrase(String entrada) {
        String operacao = "";
        char a, b, c;
        a = entrada.charAt(2);
        b = entrada.charAt(4);
        c = entrada.charAt(6);
        for (int i = 0; i < entrada.length(); i++) {
            if ((entrada.charAt(i) >= 48 && entrada.charAt(i) <= 57) || entrada.charAt(i) == ' '
                    || entrada.charAt(i) == ',') {
            } else if (entrada.charAt(i) == 'A') {
                operacao += a;
            } else if (entrada.charAt(i) == 'B') {
                operacao += b;
            } else if (entrada.charAt(i) == 'C') {
                operacao += c;
            } else if (entrada.charAt(i) == 'o') {
                operacao += '^';
                i++;
            } else if (entrada.charAt(i) == 'a') {
                operacao += '~';
                i += 2;
            } else if (entrada.charAt(i) == 'n') {
                operacao += '!';
                i += 2;
            } else {
                operacao += entrada.charAt(i);
            }
        }
        return operacao;
    }

    static void verificar(String operacao) {
        int atual = 0;
        while (atual != operacao.length() - 1) {
            String op = "";
            boolean g = true;
            while (g) {
                while (operacao.charAt(atual) != ')') {
                    atual++;
                }
                while (operacao.charAt(atual) != '~' && operacao.charAt(atual) != '^'
                        && operacao.charAt(atual) != '!') {
                    atual--;
                }
                for (int i = 0; i < atual; i++) {
                    op += operacao.charAt(i);
                }
                if (operacao.charAt(atual) == '!') {
                    if (operacao.charAt(atual + 2) == '0')
                        op += '1';
                    else
                        op += '0';
                    atual += 4;
                } else if (operacao.charAt(atual) == '^') {
                    int valor = 0;
                    int contador = 0;
                    while (operacao.charAt(atual + contador) != ')') {
                        if (operacao.charAt(atual + contador) == '1')
                            valor++;
                        contador++;
                    }
                    if (valor > 0)
                        op += '1';
                    else
                        op += '0';
                    atual += contador + 1;
                } else if (operacao.charAt(atual) == '~') {
                    int valor = 0;
                    int contador = 0;
                    while (operacao.charAt(atual + contador) != ')') {
                        if (operacao.charAt(atual + contador) == '0')
                            valor++;
                        contador++;
                    }
                    if (valor > 0)
                        op += '0';
                    else
                        op += '1';
                    atual += contador + 1;
                }
                while (atual < operacao.length()) {
                    op += operacao.charAt(atual);
                    atual++;
                }
                operacao = "";
                operacao = op;
                g = false;
                atual = 0;
            }
        }
        MyIO.println(operacao);
    }

}
