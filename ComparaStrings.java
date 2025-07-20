public class ComparaStrings 
{
    public static int comparaString(String s1, String s2)
    {
        // Determina la longitud mas corta entre ambas cadenas 
        int longMin = Math.min(s1.length(), s2.length());
        // Recorre la longitud de la cadena mas corta 
        for (int i=0; i<longMin; i++)
        {
            // Obtiene el caracter en la posicion i de ambas cadenas 
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            // Verifica si los caracteres son distintos 
            if (c1 != c2)
            {
                // Retorna la diferencia entre los caracteres
                return c1 - c2;
            }
        }
        // Si llega a este punto, las cadenas son iguales hasta el minimo de caracteres
        return s1.length() - s2.length();
    }
    
}
