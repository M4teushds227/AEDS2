#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_PERSONAS 405
#define MAX_ALT_NAMES 20

typedef struct {
    char id[10];
    char name[100];
    char alt_name[MAX_ALT_NAMES][100];
    int alt_name_count;
    char house[50];
    char ancestry[50];
    char species[50];
    char patronus[50];
    char hog_staff[5];
    char hog_student[5];
    char actor_name[100];
    int alive;
    char data[20];
    int idade;
    char cor_olho[20];
    char gender[20];
    char cor_cabelo[20];
    int wizard;
} Persona;

void initPersona(Persona *p) {
    strcpy(p->id, "id");
    strcpy(p->name, "na");
    p->alt_name_count = 0;
    strcpy(p->house, "house");
    strcpy(p->ancestry, "ancestry");
    strcpy(p->species, "species");
    strcpy(p->patronus, "patronus");
    strcpy(p->hog_staff, "false");
    strcpy(p->hog_student, "false");
    strcpy(p->actor_name, "actor_name");
    p->alive = 1; // true
    strcpy(p->data, "");
    p->idade = 0;
    strcpy(p->cor_olho, "cor_Olho");
    strcpy(p->gender, "gender");
    strcpy(p->cor_cabelo, "cor_cabelo");
    p->wizard = 1; // true
}

void setId(Persona *p, char *id) {
    strcpy(p->id, id);
}

void setName(Persona *p, char *name) {
    strcpy(p->name, name);
}

void setAltName(Persona *p, char *alt_name) {
    strcpy(p->alt_name[p->alt_name_count++], alt_name);
}

void setHouse(Persona *p, char *house) {
    strcpy(p->house, house);
}

void setAncestry(Persona *p, char *ancestry) {
    strcpy(p->ancestry, ancestry);
}

void setSpecies(Persona *p, char *species) {
    strcpy(p->species, species);
}

void setPatronus(Persona *p, char *patronus) {
    strcpy(p->patronus, patronus);
}

void setHogStaff(Persona *p, char *hog_staff) {
    if (hog_staff[0] == 'F')
        strcpy(p->hog_staff, "false");
    else
        strcpy(p->hog_staff, "true");
}

void setHogStudent(Persona *p, char *hog_student) {
    if (hog_student[0] == 'F')
        strcpy(p->hog_student, "false");
    else
        strcpy(p->hog_student, "true");
}

void setActorName(Persona *p, char *actor_name) {
    strcpy(p->actor_name, actor_name);
}

void setAlive(Persona *p, char *alive) {
    if (alive[0] == 'F')
        p->alive = 0; // false
    else
        p->alive = 1; // true
}

void setData(Persona *p, char *data) {
    strcpy(p->data, data);
}

void setIdade(Persona *p, int idade) {
    p->idade = idade;
}

void setCorOlho(Persona *p, char *cor_olho) {
    strcpy(p->cor_olho, cor_olho);
}

void setGender(Persona *p, char *gender) {
    strcpy(p->gender, gender);
}

void setCorCabelo(Persona *p, char *cor_cabelo) {
    strcpy(p->cor_cabelo, cor_cabelo);
}

void setWizard(Persona *p, char *wizard) {
    if (wizard[0] == 'F')
        p->wizard = 0; // false
    else
        p->wizard = 1; // true
}

void mostrarUm(Persona *p, char *id) {
    // Implemente conforme necessário para mostrar uma única Persona
}

void mostrarAltname(Persona *p) {
    // Implemente conforme necessário para mostrar os alternate names
}

void mostrarAltAct(Persona *p) {
    // Implemente conforme necessário para mostrar os alternate actors
}

void mostrar(Persona *p) {
    // Implemente conforme necessário para mostrar todos os detalhes de uma Persona
}

void lerP(Persona *p) {
    FILE *file = fopen("./tmp/characters.csv", "r");
    if (file == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        exit(1);
    }
    char linha[1024];
    char *token;
    while (fgets(linha, 1024, file)) {
        token = strtok(linha, ";");
        initPersona(&p);
        setId(p, token);
        token = strtok(NULL, ";");
        setName(p, token);
        // Continue com as chamadas para os setters para cada campo
    }
    fclose(file);
}

char *achar(Persona *p, char *id) {
    char *resp = NULL;
    // Implemente conforme necessário para encontrar uma Persona com um ID específico
    return resp;
}

int compararID(char *idP, char *idA) {
    int tam = strlen(idA);
    for (int i = 0; i < tam; i++) {
        if (idA[i] != idP[i]) {
            return 0; // false
        }
    }
    return 1; // true
}

int main() {
    Persona p[MAX_PERSONAS];
    lerP(p);
    char id[10];
    int cont = 0;
    while (1) {
        cont++;
        fgets(id, sizeof(id), stdin);
        id[strcspn(id, "\n")] = 0; // remove a nova linha
        if ((id[0] == 'F' && id[1] == 'I' && id[2] == 'M') || cont >= 27)
            break;
        char *result = achar(p, id);
        if (result != NULL)
            printf("%s\n", result);
    }
    return 0;
}
