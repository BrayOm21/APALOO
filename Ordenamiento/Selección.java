package Ordenamiento;

public class Selección 
{
    public static void ordenarInt(int [] a)
    {
        for(int i=0; i<a.length-1;i++)
        {
            int menor = i;
            int aux;
            for(int j=i+1; j<a.length;j++)
            {
                if(a[j]<a[menor])
                {
                    menor=j;
                }
            }
            if(i != menor)
            {
                aux=a[i];
                a[i]=a[menor];
                a[menor]=aux;
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
        for(int i = 0; i<a.length; i++)
        {
            int menor = i;
            char aux;
            for(int j= i+1; j<a.length; j++)
            {
                if(a[j]<a[menor])
                {
                    menor=j;
                }
            }
            if(i != menor)
            {
                aux=a[i];
                a[i]=a[menor];
                a[menor]=aux;
            }
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
    }
    
    public static void ordenarCadenas(String [] a)
    {
        for(int i = 0; i<a.length; i++)
        {
            int menor = i;
            String aux;
            for(int j= i+1; j<a.length; j++)
            {
                String ini = a[j];
                String fin = a[menor];
                int result = AuxCadenas.comparaCadenas(ini,fin);
                if(result<0)
                {
                    menor=j;
                }
            }
            if(i != menor)
            {
                aux=a[i];
                a[i]=a[menor];
                a[menor]=aux;
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
