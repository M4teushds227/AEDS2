
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lista lista[] = new Lista[3];
        lista[0] = new Lista(5);
        lista[1] = new Pilha();
        lista[2] = new Fila(100);
        Random numRand = new Random();
        for(int i = 0; i < 100; i++) {
            lista[2].colocarF(numRand.nextInt(3000));
        }
        //lista[2].mostrar();     
        System.out.println(lista[2].getTamanho());
    }

}
