package Primer_problemario;

public class ProgramaP6 
{
    public static void main(String[] args) 
    {
        String a = "Hola mundo";
        String b = "do";
        int total = regresaValor(a, b);
        System.out.println(total);
    }
    public static int regresaValor (String a, String b)
    {
        int longitudA = a.length();
        int longitudB = b.length();
        if (a == null || b == null || a.length() <= b.length()) 
        {
            return -1;
        }
        for (int i = 0; i < longitudA - longitudB + 1; i++) 
        {
            boolean coinciden = true;
            for (int j = 0; j < b.length(); j++) 
            {
                if (a.charAt(i + j) != b.charAt(j)) 
                {
                    coinciden = false;
                    break;
                }
            }
            if (coinciden) 
            {
                return i;
            }
        }
        return -1;
    }
}
