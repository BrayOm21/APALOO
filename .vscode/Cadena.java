public class Cadena 
{
    public static void main(String[] args) 
    {
        String texto = "Hola mundo";
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
            
        }
        return total;
    }
}
