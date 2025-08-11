package Primer_problemario;

public class ProgramaP7 
{
    public static void main(String[] args) 
    {
        int n=20;
        boolean resultado = esFibonacci(n);
        System.out.println(resultado);
    }
    public static boolean esFibonacci(int n)
    {
        if(n<0)
        {
            return false;
        }
        long N2 = (long) n * n;
        return esCuadradoPerfecto(5*N2+4) || esCuadradoPerfecto(5*N2-4);
    }
    public static boolean esCuadradoPerfecto(long num)
    {
        double raiz = Math.sqrt(num);
        return ((long) raiz) * (long) raiz == num;
    }


} 
    

