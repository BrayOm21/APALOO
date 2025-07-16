public class ProgramaP2 
{
    public static void main(String[] args) 
    {
        int [] num1 = {1,2,3,4,5,6};
        int [] num2 = {6,5,1,3,2,4};
        boolean revisar = verificaElementos(num1, num2);
        System.out.println(revisar);

    }
    public static boolean verificaElementos(int [] a, int [] b)
    {
        if (a.length != b.length) 
        {
            return false;
        }
        for(int i = 0; i<a.length; i++)
        {
            boolean encontrado = false;
            for (int j = 0; j<b.length; j++)
            {
                if (a[i]==b[j]) 
                {
                    encontrado= true;
                    break;
                }
            }
            if (encontrado==false) 
            {
                return false;
            }
        }
        return true;
    }
}