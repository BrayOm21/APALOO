package Ordenamiento;
import java.util.Scanner;
public class Caracteres 
{
    public static void ordenarCar()
    {
        int opc;
        int s=0;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Cuantos numeros quieres ordenar?");
        n = sc.nextInt();
        char[] arreglo = new char[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Introduce tu caracter " + (i + 1) + ": ");
            arreglo[i] = sc.next().charAt(0);
        }
        do {
            System.out.println("**********MENU DE ORDENAMIENTO**********");
            System.out.println("1. Ordenar por metodo burbuja");
            System.out.println("2. Ordenar por seleccion directa");
            System.out.println("3. Ordenar por insercion directa");
            System.out.print("Selecciona la opcion con la que deseas ordenar el arreglo de caracteres: ");
            opc = sc.nextInt();
            switch (opc) 
            {
                case 1:
                Burbuja.ordenarCaracter(arreglo); 
                break;
                case 2:
                //Selección.ordenarint(arreglo);
                break;
                case 3:
                //Inserción.ordenarint(arreglo); 
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
