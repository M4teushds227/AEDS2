import java.util.Scanner;

public class alge{
    public static void main(String[] args) {
        String ent;
        Scanner sc = new Scanner(System.in);
        ent = sc.nextLine();
        // MyIO my = new MyIO();
        while (!(ent.charAt(0) == '0')) {
            String nuns, exp;
            nuns = varI(ent);
            exp = mudarEx(ent);
            exp = expre(nuns, exp);
        }
    }

    public static String varI(String x) {
        String L = "";
        for (int i = 2; i <= 6; i += 2) {
            if (i == 2) {
                L += x.charAt(i);
            } else if (i == 4) {
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
            } else if (x.charAt(i)== 'a'){
                i +=2;
                L += '^';
            } else if (x.charAt(i) == 'n'){
                i+=2;
                L +='!';
            } else if (x.charAt(i) == 'o'){
                i ++;
                L +='#';
            } else if (x.charAt(i) == '('){
                L +='(';
            } else if (x.charAt(i) == ')'){
                L +=')';
            }
        }
        return L;
    }
}
