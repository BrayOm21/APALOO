public class ProgramaP4 
{
    public static void main(String[] args) 
    {
        int n=2;
        int [] fibo=fibonacci(n);
        if (fibo != null) 
        {
         for (int i = 0; i < fibo.length; i++) 
         {
            System.out.print(fibo[i] + " ");
         }   
        }
    }
    public static int[] fibonacci(int n)
    {
        if (n <= 0) 
        {
            return null;
        }
        int [] fib= new int [n];
        switch (n) 
        {
            case 1:
            fib[0] = 0;
            break;
            case 2:
            fib[0] = 0;
            fib[1] = 1;
            break;
            default:
            fib[0] = 0;
            fib[1] = 1;
            for(int i=2; i<fib.length; i++)
            {
                fib[i]=fib[i-1]+fib[i-2];
            }
        }
        return fib;
    }
}
