import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
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
    private LocalDate captureDate;

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
        this.captureDate = LocalDate.now() ;
    }

    public int getId() {
        return id;
    }

    public int getGeneration() {
        return generation;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTypes() {
        return types.getTypes();
    }

    public String getAbilities() {
        return abilities.getAbilit();
    }

    public double getWeigth() {
        return weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public boolean getIsLegendary() {
        return isLegendary;
    }

    public int getCaptureRate() {
        return captureRate;
    }

    public String getCaptureDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String resp = this.captureDate.format(formatter);
        return resp;
    }

    public LocalDate getCaptureDateSF(){
        return this.captureDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTypes(String type1, String type2) {
        this.types.setTypes(type1, type2);
        ;
    }

    public void setAbilities(String abi) {
        this.abilities.setAbilit(abi);
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setCaptureRate(int captureRate) {
        this.captureRate = captureRate;
    }

    public void setLegendary(boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    public void setCaptureDate(String captureDate) {
        int dia,mes,ano;
        String[] split;
        split = captureDate.split("/");
        dia = Integer.parseInt(split[0]);
        mes = Integer.parseInt(split[1]);
        ano = Integer.parseInt(split[2]);
        this.captureDate = LocalDate.of(ano,mes,dia);      
    }

}

class Pokedex {
    private Pokemon[] pokemons;
    private int n;

    Pokedex() {
        this(15);
    }

    Pokedex(int x) {
        this.pokemons = new Pokemon[x];
        this.n = 0;
    }

    public int getN() {
        return n;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public Pokemon getPokemon(int x) {
        return this.pokemons[x];
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public void lerP() throws IOException, ParseException {
        String caminho = "./tmp/pokemon.csv";
        Pokedex p = new Pokedex(801);
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String entrada = br.readLine();
        String[] split, split2, split3;
        int cont = 0;
        while ((entrada = br.readLine()) != null) {
            p.pokemons[cont] = new Pokemon();
            split = entrada.split("\"");
            split2 = split[0].split(",");
            split3 = split[2].split(",");
            p.pokemons[cont].setId(Integer.parseInt(split2[0]));
            p.pokemons[cont].setGeneration((Integer.parseInt(split2[1])));
            p.pokemons[cont].setName(split2[2]);
            p.pokemons[cont].setDescription(split2[3]);

            if (split2.length == 5) {
                p.pokemons[cont].setTypes(split2[4], "@");
            } else {
                p.pokemons[cont].setTypes(split2[4], split2[5]);
            }

            p.pokemons[cont].setAbilities(split[1]);

            if (split3[1].isEmpty()) {
                p.pokemons[cont].setWeigth(0);
            } else {
                p.pokemons[cont].setWeigth(Double.parseDouble(split3[1]));

            }

            if (split3[2].isEmpty()) {
                p.pokemons[cont].setHeigth(0);
            } else {
                p.pokemons[cont].setHeigth(Double.parseDouble(split3[2]));
            }

            p.pokemons[cont].setCaptureRate(Integer.parseInt(split3[3]));
            p.pokemons[cont].setLegendary(Boolean.parseBoolean(split3[4]));
            p.pokemons[cont].setCaptureDate(split3[5]);
            cont++;
        }
        br.close();
        this.setPokemons(p.pokemons);
        this.setN(cont);
    }

    public void impri(int x) {
        Pokemon p = getPokemon(x);
        System.out.println("[#" + p.getId() + " -> " + p.getName() + ": " + p.getDescription() + " - " + p.getTypes() + " - " + p.getAbilities() + " - " + p.getWeigth() + "kg" + " - " + p.getHeigth() + "m" + " - " + p.getCaptureRate() + "%" + " - " + p.getIsLegendary() + " - " + p.getGeneration() + " gen" + "]" + " - " + p.getCaptureDate());

    }

    public void addPokemon(int x,Pokedex pokedex){
        if(getN() < getPokemons().length){
            this.pokemons[getN()] = pokedex.getPokemon(x);
            this.n ++;
        }else{
            System.out.println("Pokedex cheia");
        }
    }
    
    public void addPokemonAle(Pokedex pokedex){

        Random gerador = new Random();
        gerador.setSeed(4);
        int x = gerador.nextInt(800);
        for(int i = getN();i < this.pokemons.length; i++){
            this.pokemons[getN()] = pokedex.getPokemon(x);
            this.n ++;
            x = gerador.nextInt(800);
        }
    }

    public void selecao(){
        for(int i = 0; i < getN(); i++){
            int menor = i;
            for(int j = (i + 1);j < getN();j++){
                if(this.pokemons[menor].getName().charAt(0) == this.pokemons[j].getName().charAt(0)){
                    for(int z = 1;z < this.pokemons[menor].getName().length() - 1 && z < this.pokemons[j].getName().length() - 1;z++){
                        if(this.pokemons[menor].getName().charAt(z) > this.pokemons[j].getName().charAt(z)){
                            menor = j;
                            z = this.pokemons[menor].getName().length();
                        }else if((this.pokemons[menor].getName().charAt(z) < this.pokemons[j].getName().charAt(z))){
                            z = this.pokemons[menor].getName().length();
                        }
                    }
                }else if(this.pokemons[menor].getName().charAt(0) > this.pokemons[j].getName().charAt(0)){
                    menor = j;
                }
            }
            swap(menor, i);
            System.out.println("ID = " + this.pokemons[i].getId() + " " + this.pokemons[i].getName());
        }

    }
    
    public void insercao(){
        for(int i = 1 ; i < getN(); i++){
            Pokemon tmp = this.pokemons[i];
            int j = i - 1;
            while (j >= 0 && this.pokemons[j].getCaptureDateSF().isBefore(this.pokemons[i].getCaptureDateSF())) {
                this.pokemons[j + 1] = this.pokemons[j];
                j--;
            }
            this.pokemons[j+1] = tmp;
            System.out.println(this.pokemons[j+1].getCaptureDate());
        }
    }

    public void swap(int i, int j) {
		Pokemon temp = this.pokemons[i];
		this.pokemons[i] = this.pokemons[j];
		this.pokemons[j] = temp;
	}

}

class ListaP {
    private String[] val;
    private int n;

    ListaP() {
        this(2);
    }

    ListaP(int x) {
        this.val = new String[x];
        this.n = x;
    }

    public void setAbilit(String x) {
        String tmp = "";
        String[] tmpS;
        for (int i = 0; i < x.length() - 1; i++) {
            if (x.charAt(i) != '"' && x.charAt(i) != '\'' && x.charAt(i) != '[' && x.charAt(i) != ']') {
                tmp += x.charAt(i);
            }
        }

        tmpS = tmp.split(", ");
        this.val = tmpS;
        setN(tmpS.length);        
    }

    public void setTypes(String x, String y) {
        this.val[0] = x;
        
        if (y != null) {
            this.val[1] = y;
        }

        setN(2);
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getTypes() {
        String resp = "['";
        resp += this.val[0];
        if (val[1].charAt(0) != '@') {
            resp += "', '" + this.val[1] + "']";
        } else {
            resp += "']";
        }
        return resp;
    }

    public String getAbilit() {
        String resp = "['";
        resp += this.val[0];
        for (int i = 1; i < getN(); i++) {
            resp += "', '" + this.val[i];
        }
        
        return resp += "']";
    }

    public int getN() {
        return n;
    }

}

public class Poke {
    public static void main(String[] args) {
        try {
            Pokedex pokedex = new Pokedex(800),myPokedex = new Pokedex(80);
            pokedex.lerP();
            Scanner sc = new Scanner(System.in);
            String entrada = sc.nextLine();
            while (!(entrada.charAt(0) == 'F' && entrada.charAt(1) == 'I' && entrada.charAt(2) == 'M')) {
                //pokedex.impri(Integer.parseInt(entrada) - 1);
                //myPokedex.addPokemon(Integer.parseInt(entrada) - 1,pokedex);
                myPokedex.addPokemonAle(pokedex);
                entrada = sc.nextLine();
            }
            //myPokedex.selecao();
            myPokedex.insercao();
            
            sc.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}