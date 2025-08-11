package ProblemarioEX;

public class Ej2 
{
    public static void main(String[] args) 
    {
        int [] a = {5,6,1,2,9,6,23,15,5};
        System.out.println(busca(a,0));
        System.out.println(busca(a,9));
        System.out.println(busca(a,17));
        System.out.println(busca(a,5));
    }
    public static boolean busca(int [] a, int b)
    {
        return busca(a,b, 0);
    } 
    public static boolean busca(int [] a, int b, int i)
    {
        if(i == a.length)
        {
            return false;
        }
        if(b == a[i])
        {
            return true;
        }
        return busca(a,b,i+1);
    }
}
