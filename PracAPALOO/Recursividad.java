public class Recursividad 
{
    public static void main(String[] args) 
    {    
        int i=5;
        int [] arr = {1,2,3,4};
        System.out.println("El factorial de tu numero es: "+recfactorial(i));
        System.out.println("La suma de tu arreglo es: "+sumaArreglos(arr, 0));
    }
    public static int recfactorial (int i)
    {
        if(i==1)
        {
            return 1;
        }
        return i*recfactorial(i-1);
    } 
    private static int sumaArreglos(int [] datos, int i)
    {
        if(i==datos.length-1)
        {
            return datos[i];
        }
        return datos[i]+sumaArreglos(datos, i+1);
    }
}