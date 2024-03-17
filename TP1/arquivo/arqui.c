#include <stdio.h>

void lerE(int total);
void abrirC();

int main()
{
    int numr;
    scanf("%d/n", &numr);
    lerE(numr);
    abrirC();
    return 0;
}

void lerE(int total)
{
    FILE *arquivo = fopen("arq.txt", "w+");
    for (int i = 0; i < total; i++){
        char numlido[100];
        scanf("%[^\n]", numlido);
        fprintf(arquivo,"%s\n",numlido);
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
            printf("%lf", valor);
        }
    }
    fclose(arquivo);
    
}