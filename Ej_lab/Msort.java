package Ej_lab;
import java.util.Arrays;
public class Msort 
{
    public static void main(String[] args) 
    {
        int [] arr = {9,7,3,4,6,5,1,2,55,12,65,100,30};
        msort(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");  
    }
    public static int [] msort(int [] vector)
    {
        int tam, i=0,j=0,k=0, tam_i,tam_d,aux;
        tam = vector.length;
        if(tam==1)
        {
            return vector;
        }
        if(tam==2)
        {
            if(vector[0]>vector[1])
            {
                aux=vector[0];
                vector[0]=vector[1];
                vector[1]=aux;
            }
            return vector;
        }
        tam_i = tam/2;
        tam_d = tam-tam_i;

        int [] vec_i=Arrays.copyOfRange(vector,0,tam_i);
        int [] vec_d=Arrays.copyOfRange(vector,tam_i, tam_i+tam_d); 
        msort(vec_i);
        msort(vec_d);

        for(i=0,j=0,k=0; i<tam_i && j<tam_d; k++)
        {
            vector[k]=vec_i[i] > vec_d[j]?vec_d[j++]:vec_i[i++];
        }
        for(; i<tam_i; i++,k++)
        {
            vector[k]=vec_i[i];
        }
        for(; j<tam_d; j++,k++)
        {
            vector[k]=vec_d[j];
        } 
        return vector;
    }
}
