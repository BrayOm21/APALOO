public class Pruebjas 
{
    public static void main(String[] args) 
    {
        int [] num = new int [10];
        for(int i = 0; i<10; i++)
        {
            if(i%2==0)
            {
                num[i]= i+1;
            }
            else
            {
                num[i]= i*2;
            }
        }
        for(int i = 0; i<10; i++)
        {
            System.out.println(num[i]);
        }
    }
}
