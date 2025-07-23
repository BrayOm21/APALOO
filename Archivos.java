import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;

public class Archivos 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //leerTexto("C:\\Users\\braya\\Documents\\Git\\APALOO\\Java\\pg1513.txt");   
    }    
    public static void leerTexto(String arch) throws FileNotFoundException, IOException
    {
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String l;
        while((l=f.readLine()) != null)
        {
            System.out.println(l);
        }
        f.close();
    }
}
