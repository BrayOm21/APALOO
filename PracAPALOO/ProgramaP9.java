public class ProgramaP9 
{
    public static void main(String[] args) 
    {
        int numero = 10;
        System.out.println("El siguiente número primo es: " + sigPrimo(numero));
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
    

