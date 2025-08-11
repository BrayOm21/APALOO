package ProblemarioEX;

public class Ej5 
{
    public static void main(String[] args) 
    {
        System.out.println(copia("perro cafe"));
        System.out.println(copia("La casa blanca"));
    }
    public static String copia(String s)
    {
        return copia(s.toCharArray(),0);
    }
    public static String copia(char[] s, int i)
    {
        if(i==s.length)
        {
            return "";
        }
        return s[i]+ copia(s,i+1);
    }  
}
