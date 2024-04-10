import java.util.Date;

public class classe {

    class Persona{
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
        private boolean alive;
        private Date data;
        private int idade;
        private String cor_Olho;
        private String gender;
        private String cor_cabelo;
        private boolean wizard;

        Persona(){
            this("id","name",l,"house","ancestry","species","patronus","hog","hog2","actor",true,data,0,"olha","gender","corcabelo",true);
        }
    
        Persona(String id,String name,classe.Lista alt_name,String house,String ancestry,String species,String patronus,String hog_Staff,String hog_Student,String actor_name,boolean alive,Date data,int idade,String cor_Olho,String gender,String cor_cabelo,boolean wizard){
                this.id = id;
                this.name = name;
                this.alt_name = alt_name;
                this.house = house;
                this.ancestry = ancestry;
                this.species = species;
                this.patronus = patronus;
                this.hog_Staff = hog_Staff;
                this.hog_Student = hog_Student;
                this.actor_name = actor_name;
                this.alive = alive;
                this.data = data;
                this.idade = idade;
                this.cor_Olho = cor_Olho;
                this.gender = gender;
                this.cor_cabelo = cor_cabelo;
                this.wizard = wizard;
        }

    }
    
    class Lista{
        String[] lista;
        Lista(){
           this(6);
        }
        Lista(int x){
            lista = new String[x];
        }
    }

    static void main(String[] args) {



    }

}