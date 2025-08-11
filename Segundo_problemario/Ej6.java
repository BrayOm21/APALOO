package Segundo_problemario;

public class Ej6 
{
    public static void main(String[] args) 
    {
        int [] a= {1,2,3,4,5,4,3,2,1};
        int [] b= {2,4,6,8,8,6,4,2};
        System.out.println(capicua(a));
        System.out.println(capicua(b));
    }
    public static boolean capicua(int [] a)
    {
        return capicua(a, 0, a.length-1);
    }
    public static boolean capicua (int [] a, int ini, int fin)
    {
        if(ini>=fin)
        {
            return true;
        }
        if(a[ini]!=a[fin])
        {
            return false;
        }
        return capicua(a,ini+1,fin-1);
    }
}
