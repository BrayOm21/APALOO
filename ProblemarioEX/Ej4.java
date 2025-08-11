package ProblemarioEX;

public class Ej4 
{
    public static void main(String[] args) 
    {
        double [] a = {1,2,3,4,5,6,7,8,9,10,20};
        double [] b = {1,2,3,4,5,6,7,8,9,10,20,21};
        double [] c = {2,4,6,1,3,9};
        double [] d = {9,4,8,7,21,10,11};
        System.out.println(mediana(a));
        System.out.println(mediana(b));
        System.out.println(mediana(c));
        System.out.println(mediana(d));
    }
    public static double mediana(double [] a)
    {
        return mediana(a,0,a.length-1);
    }
    public static double mediana(double [] a, int ini,int fin)
    {
        if(ini==fin)
        {
            return a[ini];
        }
        if(ini==fin-1)
        {
            return (a[ini]+a[fin])/2;
        }
        return mediana(a,ini+1,fin-1);
    }
}
