public class Recursividad 
{
    public static void main(String[] args) 
    {    
        int i=5;
        int [] arr = {1,2,3,4};
        int [] datos = {105,5,20,2,3,10,80,25,15,100};
        System.out.println("El factorial de tu numero es: "+recfactorial(i));
        System.out.println("La suma de tu arreglo 1 es: "+sumaArreglos(arr, 0));
        System.out.println("El dato mas grand del arreglo 2 es : "+mayor(datos));

    }
    public static int recfactorial (int i)
    {
        if(i==1)
        {
            return 1;
        }
        return i*recfactorial(i-1);
    } 
    public static int sumaArreglos(int [] datos, int i)
    {
        if(i==datos.length-1)
        {
            return datos[i];
        }
        return datos[i]+sumaArreglos(datos, i+1);
    }
    private static int mayor(int [] datos, int i, int j)
    {
        if(i==j)
        {
            return datos[i];
        }
        int mayorizq = mayor (datos, i, (i+j)/2);
        int mayorder = mayor (datos, (i+j)/2+1, j);
        return mayorizq>mayorder?mayorizq:mayorder;
    }
    public static int mayor(int [] datos)
    {
        return mayor(datos,0,datos.length-1);
    }
}