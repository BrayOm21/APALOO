package Ordenamiento;
import java.util.Scanner;
public class Menu 
{
    public static void main(String[] args) 
    {
        int opc = 0;;
        int s;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("**********MENU DE DATOS**********");
            System.out.println("1. Ordenar enteros");
            System.out.println("2. Ordenar caracteres");
            System.out.println("3. Ordenar cadenas");
            System.out.print("Selecciona la opcion que deseas usar: ");
            s = sc.nextInt();
            switch (s) {
                case 1:
                Enteros.ordenaEnteros();
                break;
                case 2:
                Caracteres.ordenarCaracter();
                break;
                case 3:
                Cadenas.ordenarCadenas();
                break;
                default:
                System.out.println("Selecciona una opcion valida");
                break;
            }  
            System.out.println("¿Quieres seleccionar otra opcion? 1. Si 2. No");
            opc = sc.nextInt();
        } while (opc == 1);
        System.out.println("Programa finalizado...");
        sc.close();
    }
    
}
