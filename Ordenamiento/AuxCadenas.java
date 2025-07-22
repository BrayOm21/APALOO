package Ordenamiento;

public class AuxCadenas 
{ public static int comparaCadenas(String a1, String b2)
    {
        int longMin = Math.min(a1.length(), b2.length());
        for(int i = 0; i<longMin; i++)
        {
            char c1 = a1.charAt(i);
            char c2 = b2.charAt(i);
            if(c1 != c2)
            {
                return c1 - c2;
            }
        }
        return a1.length() - b2.length();
    }  
}
