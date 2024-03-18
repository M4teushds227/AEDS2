
public class Lista {

    private int lista[];
    private int n;
    private int tamanho;

    Lista() {
        this(100);
    }

    Lista(int tamanho) {
        lista = new int[tamanho];
        n = 0;
        this.tamanho = lista.length;
    }

    public void setTLista(int tamanho) {
        this.lista = new int[tamanho];
        this.tamanho = lista.length;
    }

    public void setLista(int i,int valor) {
        this.lista[i] = valor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getN() {
        return n;
    }

    public int getLista(int x) {
        return lista[x];
    }
    
    protected void colocarI(int valor) {
        if (n < tamanho) {
            try {
                if (n == 0) {

                    for(int i = 0; i > n; i++){
                        lista[i+1] = lista[i];    
                    }
                    lista[0] = valor;
                    
                } else {
                    for (int i = 0; i < n; i++) {
                        lista[i] = valor;
                        n++;
                    }
                }

            } catch (Exception e) {
                System.out.println("deu erro no colocar Lista inicio pae");
            }
        } else {
            System.out.println("Cheio");
        }
    }

    protected void colocarF(int valor) {
        if(n < tamanho){
            try {
                lista[n] = valor;
                n++;
            } catch (Exception e) {
                System.out.println("deu erro no colocar Lista final pae");
            }
        }else{
            System.out.println("Cheio");
        }
    }

    protected int removerI() {
        if (n > 0) {
            try {
                int resp = lista[0];
                n--;

                for (int i = 0; i < n; i++) {
                    lista[i] = lista[i + 1];
                }

                return resp;
            } catch (Exception e) {
                System.out.println("erro no remover Lista");
                return 0;
            }
        } else {
            System.out.println("Lista vazia");
            return 0;
        }
    }

    protected int removerf() {
        if (n > 0) {
            try {
                int resp = lista[n];
                n--;
                return resp;
            } catch (Exception e) {
                System.out.println("erro no remover Lista");
                return 0;
            }
        } else {
            System.out.println("Lista vazia");
            return 0;
        }
    }

    protected void mostrar(){
        for(int i = 0; i < n; i++){
            System.out.println(lista[i]);
        }
    }
}
