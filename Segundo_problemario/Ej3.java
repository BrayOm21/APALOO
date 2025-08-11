package Segundo_problemario;

public class Ej3 
{
    public static void main(String[] args) 
    {
        int [] a = {1,2,3,4,5,6,7,8,9,10,20,15};
        int [] b = {10,1,2,3,4,5,6,7,8,9,10,20,21};
        System.out.println(ultimo(a));
        System.out.println(ultimo(b)); 
    }
    public static int ultimo(int []a)
    {
        return ultimo(a,0);
    }
    public static int ultimo(int [] a, int i)
    {
        if(a == null || a.length == 0)
        {
            return -1;
        }
        if(i==a.length-1)
        {
            return a[i];
        }
        return ultimo(a,i+1);
    }
}
