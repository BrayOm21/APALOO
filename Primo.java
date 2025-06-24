public class Primo 
{
    public static boolean uno(int [] a)
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i] != 1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int [] a = {1,1,1,1,1,1,1};
        boolean b = uno(a);
        System.out.println(b);
    }
}