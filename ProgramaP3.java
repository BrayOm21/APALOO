public class ProgramaP3 
{
    public static void main(String[] args) 
    {
        int a=496;
        boolean perfecto= numPerfect(a);
        System.out.println(perfecto);
    }
    public static boolean numPerfect(int n)
    {
        if (n<=1) 
        {
            return false;
        }
        int suma=0;
        for (int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                suma += i;
            }
        }
        return suma==n;
    } 
}
