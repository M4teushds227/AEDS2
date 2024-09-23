import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.Scanner;

class Pokemon {
    private int id;
    private int generation;
    private String name;
    private String description;
    private ListaP types;
    private ListaP abilities;
    private double weigth;
    private double heigth;
    private int captureRate;
    private boolean isLegendary;
    private Date captureDate;

    Pokemon() {
        this(0, 0, "name", "desc", 0.0, 0.0, 0, true);
    }

    Pokemon(int id, int generation, String name, String description, double weigth, double heigth, int captureRate,
            boolean isLegendary) {
        this.id = id;
        this.generation = generation;
        this.name = name;
        this.description = description;
        this.types = new ListaP();
        this.abilities = new ListaP();
        this.weigth = weigth;
        this.heigth = heigth;
        this.captureRate = captureRate;
        this.isLegendary = isLegendary;
        // this.captureDate = new Date(2024, 9 , 21);
    }

    public void lerP(Pokemon[] P) throws IOException, ParseException{
        String caminho = "./tmp/characters.csv";
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String entrada = br.readLine();
        String[] split;
        while ((entrada = br.readLine()) != null) {
            split = entrada.split("");
        }
    
    }
}

class ListaP {

}

public class Poke {
    public static void main(String[] args) {
        
        

    }
}
