public class ProgramaP5 
{
    public static void main(String[] args) 
    {
        String texto = "Hola$mundo 123 jaja";
        int total = regresaEntero(texto);
        System.out.println(total);
    }

    public static int regresaEntero(String texto)
    {
        if (texto == null || texto.isEmpty()) 
        {
            return 0;
        }
        char[] c = texto.toCharArray();
        int total = 0;
        for (int i = 0; i < c.length; i++) 
        {
            if (Character.isLetter(c[i])) 
            {
                if (i == 0 || !Character.isLetter(c[i - 1])) 
                {
                    total++;
                }
            }
        }
        return total;
    } 
}
