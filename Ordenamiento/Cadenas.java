package Ordenamiento;
import java.util.Scanner;
public class Cadenas 
{
    public static void ordenarCadenas()
    {
        int opc;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("¿Cuantas cadenas quieres ordenar?");
        n = sc.nextInt();
        String[] arreglo = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Introduce tu cadena " + (i + 1) + ": ");
            arreglo[i] = sc.nextLine();
        }
        do {
            System.out.println("**********MENU DE ORDENAMIENTO**********");
            System.out.println("1. Ordenar por metodo burbuja");
            System.out.println("2. Ordenar por seleccion directa");
            System.out.println("3. Ordenar por insercion directa");
            System.out.print("Selecciona la opcion con la que deseas ordenar el arreglo de cadenas: ");
            opc = sc.nextInt();
            switch (opc) 
            {
                case 1:
                Burbuja.ordenarCadenas(arreglo); 
                break;
                case 2:
                Selección.ordenarCadenas(arreglo);
                break;
                case 3:
                Inserción.ordenarCadenas(arreglo); 
                break;
                default:
                System.out.println("Selecciona una opcion valida");
                break;
            }
            System.out.println("\n¿Quieres ordenar tu arreglo por otro metodo? 1.Si 2.No"); 
            s = sc.nextInt();
        } while (s == 1);
        return;
    }
}
