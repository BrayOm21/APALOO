public class Recursividad 
{
    public static void main(String[] args) 
    {    
        int i = 5;
        int [] arr = {1,2,3,4};
        int [] datos = {105,5,20,2,3,10,80,25,15,100};
        int [] a = {-5,0,3,5,11,16,20,25};
        System.out.println("El factorial de tu numero es: "+recfactorial(i));
        System.out.println("La suma de tu arreglo 1 es: "+sumaArreglos(arr, 0));
        System.out.println("El dato mas grand del arreglo 2 es : "+mayor(datos));
        System.out.println(busq(datos,100));
        System.out.println(busquedaBinaria(a, 5));
        System.out.println(mul(5, 3));
        System.out.println(pot(5, 3));
        System.out.println(mcd(15,5));
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

    private static boolean busq(int [] datos, int i, int j, int n)
    {
        if(i==j)
        {
            return datos[i]== n ;
        }
        boolean mayorizq = busq (datos, i, (i+j)/2, n);
        boolean mayorder = busq (datos, (i+j)/2+1, j, n);
        return mayorizq || mayorder;
    }
    public static boolean busq(int [] datos, int n)
    {
        return busq(datos,0,datos.length-1,n);
    }
    private static boolean busquedaBinaria(int[] a, int x, int i, int j)
    {
        if(i>j)
        {
            return false;
        }
        int medio = i+ (j-i)/2;
        if(a[medio] == x)
        {
            return true;
        }
        if(x>a[medio])
        {
            return busquedaBinaria(a, x, medio+1, j);
        }
        return busquedaBinaria(a, x, i, medio-1);
    }
    public static boolean busquedaBinaria(int [] a, int x)
    {
        return busquedaBinaria(a,x,0,a.length-1);
    }
    public static int mul(int a, int b)
    {
        if(b==0)
        {
            return 0;
        }
        return a+mul(a,b-1);
    }
    public static int pot(int a,int b)
    {
        if(b==0)
        {
            return 1; 
        }
        return a*pot(a,b-1);
    }
    public static int mcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        if(b==0)
        {
            return a;
        }
        if(a>=b)
        {
            return mcd(a-b,  a);
        }
        return mcd(a,b-a);
    }
}