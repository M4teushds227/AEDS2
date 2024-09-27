#include <stdio.h>
#include <stdlib.h>

void lerE(int total);
void abrirC(int total);

int main()
{
    int numr;
    scanf("%d/n", &numr);
    lerE(numr);
    abrirC(numr);
    return 0;
}

void lerE(int total)
{
    FILE *arquivo = fopen("arq.txt", "w+");
    for (int i = 0; i < total; i++)
    {
        double numlido;
        scanf("%lf", &numlido);
        fprintf(arquivo, "%f\n", numlido);
    }
    fclose(arquivo);
}

void abrirC(int total)
{

    FILE *arquivo = fopen("arq.txt", "r");
    for (int i = total; i >= 0; i--)
    {
    fseek(arquivo, i, SEEK_SET);
        float valor;
        fscanf(arquivo, "%f", &valor);
        if (valor == (long)valor)
        {
            printf("%f\n", (int)valor);
        }
        else
        {
            printf("%f\n", valor);
        }
    }

    fclose(arquivo);
}
