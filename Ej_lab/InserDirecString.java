package Ej_lab;
public class InserDirecString 
{
    public static void main(String[] args) 
    {
        String [] cad1 = {"hola", "uno", "tres", "mañana", "lunes"}; 
        insersionDirectaString(cad1);
    }
    public static void insersionDirectaString(String [] a)
    {
        for(int i = 1; i < a.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                String actual = a[j];
                String siguiente = a[j-1];
                int resultado = ComparaStrings.comparaString(actual, siguiente);
                if(resultado < 0)
                {
                    String aux = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = aux;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
    }    
    
}
