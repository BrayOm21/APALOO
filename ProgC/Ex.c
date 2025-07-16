#include <stdio.h>
int main()
{
    int numeros[10];
    char nombre [50];
    int cantidad = 0;
    int opc;
    do
    {
        printf("===MENU PRINCIPAL===\n");
        printf("1. Capturar numeros\n");
        printf("2. Ordenar numeros\n");
        printf("3. Capturar nombre\n");
        printf("4. Contar vocales del nombre\n");
        printf("5. Mostrar número mayor\n");
        printf("0. Salir\n");
        printf("Selecciona una opción: \n");
        scanf("%d", &opc);
        switch (opc)
        {
        case 1:
            /* code */
            break;
        case 2:
            /* code */
            break;
        case 3:
            /* code */
            break;
        case 4:
            /* code */
            break;
        case 5:
            /* code */
            break;
        default:
            break;
        }
    }while (opc!=0);
    return 0;
}