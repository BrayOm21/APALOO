import java.util.LinkedList;
import java.util.Queue;

public class ColaLigada 
{
    public static void main(String[] args) 
    {
        Queue<Integer> c = new LinkedList<>();
        
        c.add(1);
        c.add(2);
        c.add(3);
        for(Integer i : c)
        {
            System.out.println(i);
        }
        System.out.println(c.poll()+ " num " +c.size());
        System.out.println("Queda");
        for(Integer i : c)
        {
            System.out.println(i);
        }
    }

    
}
