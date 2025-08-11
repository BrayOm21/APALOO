package Primer_problemario;

public class ProgramaP1 
{
    public static void main(String[] args) 
    {
        int [] num1= {1,2,3,4,5};
        int [] num2= {1,2,3,4,5};
        boolean resultado = comparaArreglos(num1, num2);
        System.out.println(resultado);
    }
    public static boolean comparaArreglos(int[] a, int[] b)
    {
        if (a.length != b.length)
        {
            return false;
        }
        for (int i=0; i<a.length; i++) 
        {
            if (a[i] != b[i]) 
            {
                return false;
            }
        }
        return true;
    }
}
