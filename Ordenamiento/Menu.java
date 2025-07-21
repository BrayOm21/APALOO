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
            System.out.print("Selecciona el dato que deseas ordenar: ");
            s = sc.nextInt();
            switch (s) {
                case 1:
                Enteros.ordenaEnteros();
                break;
                case 2:
                break;
                case 3:
                break;
                default:
                System.out.println("Selecciona una opcion valida");
                break;
            }  
            System.out.println("¿Quieres ordenar otro tipo de dato? 1. Si 2. No");
            opc = sc.nextInt();
        } while (opc == 1);
        System.out.println("Programa finalizado...");
        sc.close();
    }
    
}
