import java.util.Scanner;

public class algebool {
    public static void main(String[] args) {
        String ent;
        Scanner sc = new Scanner(System.in);
        ent = sc.nextLine();
        // MyIO my = new MyIO();
        while (!(ent.charAt(0) == '0')) {
            String nuns, exp;
            nuns = varI(ent);
            exp = mudarEx(ent);
        }
    }

    public static String varI(String x) {
        String L = "";
        for (int i = 3; i <= 7; i += 2) {
            if (i == 3) {
                L += x.charAt(i);
            } else if (i == 5) {
                L += x.charAt(i);
            } else {
                L += x.charAt(i);
            }
        }
        return L;
    }

    public static String mudarEx(String x) {
        String L = "";
        for (int i = 6; i < x.length(); i++) {
            if (x.charAt(i) == ' ' || x.charAt(i) == '0' || x.charAt(i) == '1' || x.charAt(i) == ',') {
            } else {
                L += x.charAt(i);
            }
        }
        return L;
    }

    public static String expre(String nuns, String x) {
        String L = "";

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'A') {
                L += nuns.charAt(0);
            } else if (x.charAt(i) == 'B') {
                L += nuns.charAt(1);
            } else if (x.charAt(i) == 'C') {
                L += nuns.charAt(2);
            }
        }

        for (int i = 0; i < x.length(); i++) {}

            if (x.charAt(i) == 'a'){
                
            i += 2;
        }
        return L;
    }
}
