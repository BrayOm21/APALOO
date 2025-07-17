public class SelecciónDirecta 
{
    public static void main(String[] args) 
    {
        int [] arreglo = {1,5,7,9,3};
        seleccionDirecta(arreglo);
    }
    public static void seleccionDirecta(int[] a)
    {
        for(int i=0; i<a.length-1;i++)
        {
            int menor = i;
            int aux;
            for(int j=i+1; j<a.length;j++)
            {
                if(a[j]<a[menor])
                {
                    menor=j;
                }
            }                
            if(i != menor)
            {
                aux=a[i];
                a[i]=a[menor];
                a[menor]=aux;
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
