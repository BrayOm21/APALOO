import java.util.Scanner;

class cliente{
    String nombre;
    long numero;
    char tipo;
    float saldo;
    int edad;

    public cliente(String nombre, long numero, char tipo, float saldo, int edad) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: " + saldo);
        System.out.println("Edad: " + edad);
        System.out.println("-------------------------");
    }
}
public class PracticaBanco 
{
public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);

        System.out.print("Indica el número de clientes: ");
        int n = cap.nextInt();
        cap.nextLine();  // Limpiar el buffer

        cliente[] lista = new cliente[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Cliente " + (i + 1) + " ---");

            System.out.print("Nombre: ");
            String nombre = cap.nextLine();

            System.out.print("Número: ");
            long numero = cap.nextLong();

            System.out.print("Tipo (A/B/C): ");
            char tipo = cap.next().charAt(0);

            System.out.print("Saldo: ");
            float saldo = cap.nextFloat();

            System.out.print("Edad: ");
            int edad = cap.nextInt();
            cap.nextLine();  // Limpiar buffer

            lista[i] = new cliente(nombre, numero, tipo, saldo, edad);
        }

        System.out.println("\n--- Datos de los clientes ---");
        float sumaSaldos = 0;
        for (cliente c : lista) {
            c.mostrarDatos();
            sumaSaldos += c.saldo;
        }

        float promedio = sumaSaldos / n;
        System.out.println("Saldo promedio: " + promedio);
    }   
}
