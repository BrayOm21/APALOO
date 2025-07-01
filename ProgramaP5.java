public class ProgramaP5 
{
    public static void main(String[] args) 
    {
        String texto;
        texto = "las vacas vuelan pero sólo a altura bajas";
        int total = contarPalabras(texto);
        System.out.println(total);
    }

    public static int contarPalabras(String texto) 
    {
        if (texto == null || texto.isEmpty()) 
        {
            return 0;
        }
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }
}
