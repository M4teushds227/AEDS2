import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class arqui {

    public static void main(String[] args) {
        int numR;
        numR = MyIO.readInt();
        
        try{
            lerE(numR);
            abrirC();

        }catch(Exception e){
            MyIO.println("erro");
        }
    }
    
    static void lerE(int total) throws IOException {
        RandomAccessFile arquivo = new RandomAccessFile("arq.txt", "rw");
        for(int i = 0; i < total;i ++){
            double numlido;
            numlido = MyIO.readDouble();
            arquivo.writeDouble(numlido);
        }
        arquivo.close();
    }

    static void abrirC() throws IOException {
        RandomAccessFile arquivo = new RandomAccessFile("arq.txt", "r");
        long n = arquivo.length();
        arquivo.seek(n);
        while (n > 0) {
            n -= 8;
            arquivo.seek(n);
            double valor = arquivo.readDouble();
            if(valor == (long) valor){
                MyIO.println((int) valor);
            }else{
                MyIO.println(valor);
            }
        }

        arquivo.close();
    }
}