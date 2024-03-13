#include <stdio.h>

void lerE(int total);
void abrirC();

int main()
{
    int numr;
    scanf("%d", numr);
    lerE(numr);
    abrirC();
    return 0;
}

void lerE(int total)
{
    FILE *arquivo = fopen("arq.txt", "r+");
    for (int i = 0; i < total; i++){
        double numlido;
        scanf("%f",numlido);
        fwrite(&numlido, sizeof(double), 1 ,arquivo);
    }
    fclose(arquivo);
}

void abrirC(){
    FILE *arquivo = fopen("arq.txt", "r");
    fseek(arquivo, 0, SEEK_END);
    long n = ftell(arquivo);
    while (n > 0)
    {
        n-=8;
        fseek(arquivo,n,SEEK_SET);
        double valor = fgetc(arquivo);
        if(valor == (long) valor){
            printf("%d",(int) valor);
        }else{
            printf("%f", valor);
        }
    }
    fclose(arquivo);
    
}