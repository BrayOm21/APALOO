    public class ProgramaP10
{
    public static void main(String[] args)
    {
        int[] numeros1 = {4,6,8,12,18};
        int datos = mcm(numeros1);
        System.out.println(datos);
    }

    public static boolean uno(int [] a)
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i] != 1)
            {
                return false;
            }
        }
        return true;
    }

    public static int mcm(int [] datos)
    {

        int multiplo=1;
        int divisor=2;
        while (!uno (datos))
        {
            boolean dividio=false;
            for (int i=0; i<datos.length; i++)
            {
                if(datos[i]%divisor==0)
                {
                    dividio=true;
                    datos[i]=datos[i]/divisor;
                }
            }
            if(dividio)
            {
                multiplo=multiplo*divisor;
            }
            else
            {
                divisor= sigPrimo(divisor);
            }
        }
        return multiplo;
    }

    private static boolean isPrime(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }
        for (int i = 2; i * i <= number; i++) 
        {
            if (number % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    public static int sigPrimo(int currentNumber) 
    {
        int nextCandidate = currentNumber + 1;
        while (true) 
        {
            if (isPrime(nextCandidate)) 
            {
                return nextCandidate;
            }
            nextCandidate++;
        }
    }
}


