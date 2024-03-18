
public class Fila extends Lista {
    
    private int primeiro;
    private int ultimo;

    Fila(){
        this(5);
    }

    Fila(int t){
        setTLista(t+1);
        ultimo = primeiro = 0;
    }
    
    @Override
    protected void colocarF(int valor){
        if(((ultimo+1) % getLista(valor)) == primeiro){
            
            System.out.println("Fila cheia");

        }else{
            
            setLista(ultimo,valor);
            ultimo = (ultimo + 1) % getTamanho();

        }
    }

    @Override
    protected int removerI(){
        if(primeiro == ultimo){
            System.out.println("lista vazia");
            return 0;
        }else{

            int resp = getLista(primeiro);
            primeiro = (primeiro + 1) % getTamanho();
            return resp;
        }
    }

    @Override
    protected void mostrar(){
        for(int i = primeiro; i != getTamanho(); i = (i + 1) % getTamanho()){
            System.out.println("Numero " + i + " : " + getLista(i));
        }
    }
}