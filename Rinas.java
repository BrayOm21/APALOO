public class Rinas 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
    }
    public static boolean seMatan(int r1, int c1, int r2, int c2)
    {
        if(r1==r2 || c1==c2)
        {
            return true;
        }
        return Math.abs(r1-r2) == Math.abs(c2-c1);
    }
    /*public static boolean posibilidad(int[]reinas, int n, int c)
    {
        for(int i=0 ;i<c; i++ )
        {
            if(seMatan(i,reinas[i],n,c))
            {
                return true;
            }
            return true;
        }
    }*/
    public static void pintaTablero(int numsol,int [] reinas)
    {
        
    }
    
}
