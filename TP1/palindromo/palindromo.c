#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

char* lerLinha(){

    char buffer[256];  // Buffer temporário para armazenar a linha
    char* linha = NULL; // Ponteiro para armazenar a linha final

    if (fgets(buffer, sizeof(buffer), stdin) != NULL) {
        // Remove o caractere de nova linha, se estiver presente
        int len = strlen(buffer);
        if (len > 0 && buffer[len - 1] == '\n') {
            buffer[len - 1] = '\0';
        }

        // Aloca dinamicamente memória para armazenar a linha
        linha = (char*)malloc(len);

        // Copia a linha para a memória alocada dinamicamente
        strcpy(linha, buffer);
    }

    return linha;
}

bool palin(char* frase , int tamanho){
    bool resp =true;
    for(int x = 0; x < tamanho / 2;x++){
        if(frase[x] != frase[tamanho - 1 - x]){
            resp = false;
            x = tamanho;
        }
    }
    
    return resp;
}

int main(){
    int tamanho;
    bool i = true,resp;
    while (i)
    {
        char* palavra = lerLinha();
        tamanho = strlen(palavra);
        if(tamanho > 2){
            if(palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M'){
                i = false;
            }else{    
                resp = palin(palavra,tamanho);  
                if (resp == true){
                    printf("SIM\n");                    
                }else{
                    printf("NAO\n");
                }
                
            }    
        }else if(palavra[0] == palavra[1]){
            printf("SIM\n");
        }else{
            printf("NAO\n");
        }
    free(palavra);
    }   
    return 0;
}
