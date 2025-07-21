package Ordenamiento;

public class Inserción 
{
    public static void ordenarint(int [] a)
    {
        for(int i = 1; i < a.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(a[j] < a[j - 1])
                {
                    int aux = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = aux;
                }
                else
                {
                    break;
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
