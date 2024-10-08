import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

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
    private String data;
    private int ida;
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
        this.ida = idade;
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
        if (hog_Staff.charAt(0) == 'F') {
            this.hog_Staff = "false";
        } else {
            this.hog_Staff = "false";
        }
    }

    public void setHog_Student(String hog_Student) {
        if (hog_Student.charAt(0) == 'F') {
            this.hog_Student = "false";
        } else {
            this.hog_Student = "false";
        }
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public void setAlternate_actors(String alternate_actors) {
        this.alternate_actors.setLista(alternate_actors);
    }

    public void setAlive(String alive) {
        if (alive.charAt(0) == 'F') {
            this.alive = false;
        } else {
            this.alive = false;
        }
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setIdade(String ida) {
        this.ida = Integer.parseInt(ida);

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
        if (wizard.charAt(0) == 'F') {
            this.wizard = false;
        } else {
            this.wizard = false;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        String resp = "";
        if (this.name == "") {
            resp = "false";
        } else {
            resp = this.name;
        }
        return resp;
    }

    public String getHouse() {
        String resp = "";
        if (this.house == "") {
            resp = "false";
        } else {
            resp = this.house;
        }
        return resp;
    }

    public String getAncestry() {
        String resp = "";
        if (this.ancestry == "") {
            resp = "false";
        } else {
            resp = this.ancestry;
        }
        return resp;
    }

    public String getSpecies() {
        String resp = "";
        if (this.species == "") {
            resp = "false";
        } else {
            resp = this.species;
        }
        return resp;
    }

    public String getPatronus() {
        String resp = "";
        //if (this.patronus == "") {
        //    resp = "false";
        //} else {
            resp = this.patronus;
        //}
        return resp;
    }

    public String getHog_Staff() {
        String resp = "";
        if (this.hog_Staff == "") {
            resp = "false";
        } else {
            resp = this.hog_Staff;
        }
        return resp;
    }

    public String getHog_Student() {
        String resp = "";
        if (this.hog_Student == "") {
            resp = "false";
        } else {
            resp = this.hog_Student;
        }
        return resp;
    }

    public String getActor_name() {
        String resp = "";
        //if (this.actor_name == "") {
        //     resp = "false";
        // } else {
            resp = this.actor_name;
        // }
        return resp;
    }

    public boolean getAlive() {
        return alive;
    }

    public int getIdade() {
        return ida;
    }

    public String getCor_Olho() {
        String resp = "";
        if(this.cor_Olho == ""){
            resp = "false";
        }else{
            resp = this.cor_Olho;
        }
        return resp;
    }

    public String getGender() {
        String resp = "";
        if(this.gender == ""){
            resp = "false";
        }else{
            resp = this.gender;
        }
        return resp;
    }

    public String getCor_cabelo() {
        String resp = "";
        if(this.cor_cabelo == ""){
            resp = "false";
        }else{
            resp = this.cor_cabelo;
        }
        return resp;
    }

    public boolean getWizard() {
        return wizard;
    }

    public String[] getAlt_name() {
        return alt_name.getLista();
    }

    public int getNL() {
        return alt_name.getN();
    }

    public String getData() {
        return this.data;
    }

    public void mostrarUm(Persona[] p, String id) {
        for (Persona x : p) {
            if (x.getId() == id) {
                System.out.println("Id : " + getId());
                System.out.println("Name : " + getName());
                System.out.println("Alternate_names : " + mostrarAltname());
                System.out.println("House : " + getHouse());
                System.out.println("Ancestry : " + getAncestry());
                System.out.println("Species : " + getSpecies());
                System.out.println("Patronus : " + getPatronus());
                System.out.println("Hogwarts Staff : " + getHog_Staff());
                System.out.println("Hogwarts Student : " + getHog_Student());
                System.out.println("Actor name : " + getActor_name());
                System.out.println("Alive : " + getAlive());
                System.out.println("Alternate actors : " + getActor_name());
                System.out.println("Date of Birth : " + getData());
                System.out.println("Year of Birth : " + getIdade());
                System.out.println("Eye Colour : " + getCor_Olho());
                System.out.println("Gender : " + getGender());
                System.out.println("Hair Colour : " + getCor_cabelo());
                System.out.println("Wizard : " + getWizard());
                break;
            }
        }
    }

    public String mostrarAltname() {
        String resp;
        resp = this.alt_name.verLista();
        return resp;
    }

    public String mostrarAltAct() {
        String resp;
        resp = this.alternate_actors.verLista();
        return resp;
    }

    public String mostrar() {
        String resp = "[";
        resp += getId() + " ## " + getName() + " ## " + mostrarAltname() + " ## " + getHouse() + " ## " + getAncestry()
                + " ## " + getSpecies() + " ## " + getPatronus() + " ## " + getHog_Staff() + " ## " + getHog_Student() + " ## " + getActor_name() + " ## " + getAlive()
                + " ## " + getData() + " ## " + getIdade() + " ## " + getCor_Olho() + " ## " + getGender() + " ## "
                + getCor_cabelo() + " ## " + getWizard() + "]";
        return resp;
    }

}

class Lista {
    private String[] lista;
    private int n;

    Lista() {
        this(20);
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
        if (lista.length() > 0) {
            if (lista.charAt(1) != ']') {
                String tmp = "";
                for (int i = 0; i < lista.length(); i++) {
                    if (lista.charAt(i) == '[' || lista.charAt(i) == ']' || lista.charAt(i) == 39) {
                    } else if (lista.charAt(i) == ',') {
                        tmp += lista.charAt(i);
                        i++;
                    } else {
                        tmp += lista.charAt(i);
                    }
                }
                this.lista = tmp.split(",");
                this.n = this.lista.length;
            } else {
                this.lista = null;
            }
        } else {
            this.lista = null;
        }
    }

    public String verLista() {
        String tmp = "{";
        String[] l = getLista();
        if (getN() > 0) {
            for (int fora = 0; fora < getN(); fora++) {
                for (int dentro = 0; dentro < l[fora].length(); dentro++) {
                    tmp += lista[fora].charAt(dentro);
                }
                if ((fora + 1) == getN()) {
                    tmp += "}";
                } else {
                    tmp += ", ";
                }
            }
        } else {
            tmp += "}";
        }
        return tmp;
    }
}

public class classe {
    public static void main(String[] args) {
        Persona[] p = new Persona[405];
        try {
            lerP(p);
            boolean i = true;
            String id;
            int cont = 0;
            while (i) {
                cont ++;
                id = MyIO.readLine();
                if ((id.charAt(0) == 'F' && id.charAt(1) == 'I' && id.charAt(2) == 'M') || cont >= 27) {
                    i = false;
                } else {
                    MyIO.println(achar(p, id));
                }
            }
        } catch (Exception e) {
            System.err.println("erro " + e);
        }
    }

    static void lerP(Persona[] p) throws IOException, ParseException {
        String caminho = "./tmp/characters.csv";
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha = br.readLine();
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
            p[cont].setData(splt[12]);
            p[cont].setIdade(splt[13]);
            p[cont].setCor_Olho(splt[14]);
            p[cont].setGender(splt[15]);
            p[cont].setCor_cabelo(splt[16]);
            p[cont].setWizard(splt[17]);
            cont++;
        }
        br.close();
    }

    public static String achar(Persona[] p, String id) {
        String resp = "";
        for (Persona x : p) {
            if (compararID(x.getId(), id)) {
                resp = x.mostrar();
                break;
            } else {
                resp = "";
            }
        }
        return resp;
    }

    public static Boolean compararID(String idP, String idA) {
        boolean resp = true;
        int tam = idA.length();
        for (int i = 0; i < tam; i++) {
            if (idA.charAt(i) != idP.charAt(i)) {
                resp = false;
            }
        }
        return resp;
    }
}