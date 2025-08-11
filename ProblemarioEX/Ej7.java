package ProblemarioEX;

import java.util.Arrays;

public class Ej7 
{
    public static void main(String[] args) 
    {
        int [] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(invierte(a)));
    }
    public static int[] invierte(int [] a)
    {
        return invierte(a,0,a.length-1);   
    }
    public static int [] invierte(int [] a, int ini, int fin)
    {
        if(ini>=fin)
        {
            return a;
        }
        else
        {
            int aux;
            aux=a[ini];
            a[ini]=a[fin];
            a[fin]=aux;
            return invierte(a,ini+1,fin-1);
        }
    }
    
}
