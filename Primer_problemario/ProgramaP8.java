package Primer_problemario;

public class ProgramaP8 
{
    public static void main(String[] args) 
    {
        int [] arr = {1,2,3,4,5,6,7,8};
        int n = 2;    
        rotarArreglo(arr, n);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void rotarArreglo (int[] arr, int n)
    {
        if(arr == null || arr.length == 0)
        {
            return;
        }
        int tamaño = arr.length;
        n = n % tamaño;
        for(int i=0; i<n; i++)
        {
            int ultimoElem = arr[tamaño-1];
            for(int j=tamaño-1; j>0; j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = ultimoElem;
        }
    }
    
}
