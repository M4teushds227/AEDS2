import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class Persona {

    private String id;
    private String name;
    private Lista alt_name;
    private String house;
    private String ancestry;
    private String species;
    private String patronus;
    private String hog_Staff;
    private String hog_Student;
    private String actor_name;
    private Lista alternate_actors;
    private boolean alive;
    private Date data;
    private int idade;
    private String cor_Olho;
    private String gender;
    private String cor_cabelo;
    private boolean wizard;

    Persona() {
        this("id", "na", "house", "ancestry", "species", "patronus", "hog_Staff", "hog_Student", "actor_name", true, 0,
                "cor_Olho", "gender", "cor_cabelo", true);
    }

    Persona(String id, String name, String house, String ancestry, String species, String patronus, String hog_Staff,
            String hog_Student, String actor_name, boolean alive, int idade, String cor_Olho, String gender,
            String cor_cabelo, boolean wizard) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.ancestry = ancestry;
        this.species = species;
        this.patronus = patronus;
        this.hog_Staff = hog_Staff;
        this.hog_Student = hog_Student;
        this.actor_name = actor_name;
        this.alive = alive;
        this.idade = idade;
        this.cor_Olho = cor_Olho;
        this.gender = gender;
        this.cor_cabelo = cor_cabelo;
        this.wizard = wizard;
        this.alt_name = new Lista();
        this.alternate_actors = new Lista();
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAlt_name(String alt_name) {
        this.alt_name.setLista(alt_name);
    }
    
    public void setHouse(String house) {
        this.house = house;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public void setHog_Staff(String hog_Staff) {
        if(hog_Staff.charAt(0) == 'F'){
            this.hog_Staff = "false";
        }else{
            this.hog_Staff = "true";
        }
    }
    
    public void setHog_Student(String hog_Student) {
        if(hog_Student.charAt(0) == 'F'){
            this.hog_Student = "false";
        }else{
            this.hog_Student = "true";
        }
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public void setAlternate_actors(String alternate_actors) {
        this.alternate_actors.setLista(alternate_actors);
    }

    public void setAlive(String alive) {
        if(alive.charAt(0) == 'F'){
            this.alive = false;
        }else{
            this.alive = true;
        }    
    }

    public void setData(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        this.data = formato.parse(data);
    }

    public void setIdade(String idade) {
        this.idade = Integer.parseInt(idade);

    }   

    public void setCor_Olho(String cor_Olho) {
        this.cor_Olho = cor_Olho;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCor_cabelo(String cor_cabelo) {
        this.cor_cabelo = cor_cabelo;
    }

    public void setWizard(String wizard) {
        if(wizard.charAt(0) == 'F'){
            this.wizard = false;
        }else{
            this.wizard = true;
        }
    }

    public  String getId() {
        return id;
    }

    public  String getName() {
        return name;
    }

    public  String getHouse() {
        return house;
    }

    public  String getAncestry() {
        return ancestry;
    }

    public  String getSpecies() {
        return species;
    }

    public  String getPatronus() {
        return patronus;
    }

    public  String getHog_Staff() {
        return hog_Staff;
    }

    public  String getHog_Student() {
        return hog_Student;
    }

    public  String getActor_name() {
        return actor_name;
    }

    public  boolean getAlive() {
        return alive;
    }

    public  int getIdade() {
        return idade;
    }

    public  String getCor_Olho() {
        return cor_Olho;
    }

    public  String getGender() {
        return gender;
    }

    public  String getCor_cabelo() {
        return cor_cabelo;
    }

    public  boolean getWizard() {
        return wizard;
    }

    public  String[] getAlt_name() {
        return alt_name.getLista();
    }

    public int getNL(){
        return alt_name.getN();
    }

    public  Date getData() {
        return data;
    }

    public  void mostrarUm(Persona[] p,String id){
        for(Persona x : p){
            if(x.getId() == id){
                System.out.println("Id : " + getId());
                System.out.println("Name : " + getName());
                System.out.println("Alternate_names : " + mostrarAltname());
                //name;alternate_names;house;ancestry;species;patronus;hogwartsStaff;hogwartsStudent;actorName;alive;alternate_actors;dateOfBirth;yearOfBirth;eyeColour;gender;hairColour;wizard


                break;
            }
        }
        

    }

    public String mostrarAltname(){
        String resp= "";
        //resp = this.alt_name.verLista("");
        return resp;
    }
    // public  void mostrar(){
    //     int cont = 0;
    //     String resp = "";
    //     //{} ## Slytherin ## muggleborn ## human ##  ## false ## false ##  ## false ## 31-12-1926 ## 1925 ## dark ## female ## black ## false]
    //     resp +="["+ getId() +" ## " + getName() + " ## {";
    //     if(alt_name.getN() > 0){
    //         if(alt_name.getN() > 1){
    //             for(cont = 0;cont < getNL();cont++){
    //                 resp += l[cont] + ", ";
    //             }
    //             resp += l[cont+ 1] + "}";
    //         }else{
    //             resp += l[cont] + "}";
    //         }
    //     }else{
    //         resp += "}";
    //     }
    //     resp += " ## " + getHouse() + " ## " + getAncestry() + " ## " + getSpecies() + " ## " + getPatronus() + " ## " + getHog_Staff() + " ## " + getHog_Student () + " ## " + getActor_name() + " ## " + getAlive() + " ## " + getData() + " ## " + getIdade() + " ## " + getCor_Olho() + " ## " + getGender() + " ## " + getCor_cabelo() + " ## " + getWizard() + "]";
    // }

}

class Lista {
        private String[] lista;
        private int n;

    Lista() {
        this(15);
    }

    Lista(int x) {
        this.n = 0;
    }

    public String[] getLista() {
        return lista;
    }

    public int getN() {
        return n;
    }

    public void setLista(String lista) {
        if(lista.length() > 0){
            this.lista = lista.split(",");
            this.n = this.lista.length;
            System.err.println(this.n);
        }else{
            this.lista[0] = "{"; 
            this.lista[1] = "}"; 
        }
    }

    //public String verLista(String resp) {
        
    //}

    
}

public class classe {

    public static void main(String[] args) {
        Persona[] p = new Persona[406];
        try {
            lerP(p);
        } catch (Exception e) {
            System.err.println("erro " + e);
        }
    }

    static void lerP(Persona[] p) throws IOException, ParseException{
        String caminho = "./tmp/characters.csv";
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha = "";
        String[] splt;
        int cont = 0;
        while ((linha = br.readLine()) != null) {
            p[cont] = new Persona();
            splt = linha.split(";");
            p[cont].setId(splt[0]);
            p[cont].setName(splt[1]);
            p[cont].setAlt_name(splt[2]);
            p[cont].setHouse(splt[3]);
            p[cont].setAncestry(splt[4]);
            p[cont].setSpecies(splt[5]);
            p[cont].setPatronus(splt[6]);
            p[cont].setHog_Staff(splt[7]);
            p[cont].setHog_Student(splt[8]);
            p[cont].setActor_name(splt[9]);
            p[cont].setAlive(splt[10]);
            p[cont].setAlternate_actors(splt[11]);
            //p[cont].setData(splt[12]);
            //p[cont].setIdade(splt[13]);
            System.err.println(splt[12]);
            System.err.println(splt[13]);
            p[cont].setCor_Olho(splt[14]);
            p[cont].setGender(splt[15]);
            p[cont].setCor_cabelo(splt[16]);
            p[cont].setWizard(splt[17]);
        }
        br.close();
    }

}