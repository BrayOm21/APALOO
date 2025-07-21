package Examen;
public class Prog1Exam 
{
    public static void main(String[] args) 
    {
        int [] uno = {1,3,5,7,9};
        int [] dos = {2,4,6,8,10};
        int [] tres = nuevoArreglo(uno,dos);
        for(int i=0;i<tres.length;i++)
        {
            System.out.println(tres[i]);
        }
    }

    public static int [] nuevoArreglo(int[] a, int[] b)
    {
        int i=0;
        int j=0;
        int k=0;
        int [] c = new int[a.length+b.length];
        while (i<a.length && j<b.length) 
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                i++;
            }
            else
            {
                c[k]=b[j];
                j++;
            }
            k++;       
        }
         while (i<a.length) 
         {
            c[k]=a[i];
            i++;
            k++;
         }
         while (j<b.length) 
         {
            c[k]=b[j];
            j++;
            k++;
         }
        return c;
    }
}

