package Segundo_problemario;

public class Ej1 
{
    public static void main(String[] args) 
    {
        int [] a ={1,2,3,4,5,6,7,8,9,10,20,15};
        int [] b ={10,1,2,3,4,5,6,7,8,9,10,20,15};
        System.out.println(iguales(a,a));
        System.out.println(iguales(b,b));
        System.out.println(iguales(a,b));  
    }
    public static boolean iguales(int [] a, int [] b, int i)
    {
        if(a.length != b.length)
        {
            return false;
        }
        if(i==a.length)
        {
            return true;
        }
        if(a[i] != b[i])
        {
            return false;
        }
        return iguales(a,b, i+1);
    }
    public static boolean iguales(int [] a, int [] b)
    {
        return iguales(a,b,0);
    }
}
