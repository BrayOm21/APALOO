package Ordenamiento;

public class Burbuja 
{
    public static void ordenarInt(int [] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
    }
    
    public static void ordenarCaracter(char [] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    char aux = a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
    }

    
}
