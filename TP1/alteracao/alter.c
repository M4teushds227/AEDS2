#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

void *alter(char c[], int i, char orig, char troca);

int main()
{

    bool i = true;
    char c[1000];
    srand(4);
    while (i)
    {
        char orig = 'a' + (abs(rand()) % 26);
        char troca = 'a' + (abs(rand()) % 26);
        scanf(" %[^\n]", &c);
        if (c[0] == 'F' && c[1] == 'I' && c[2] == 'M')
        {
            i = false;
        }
        else
        {
            alter(c, 0, orig, troca);
        }
    }
    return 0;
}

void *alter(char c[], int i, char orig, char troca)
{
    int tamanho = strlen(c);
    if (i == tamanho)
    {
        printf("\n");
    }
    else
    {
        if (c[i] == orig)
        {
            c[i] = troca;
        }
        printf("%c", c[i]);
        alter(c, i + 1, orig, troca);
    }
}