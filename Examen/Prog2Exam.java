package Examen;
class Coordenada
{ 
    public int renglon;
    public int columna;
    public Coordenada(int renglon, int columna) 
    {
        this.renglon = renglon;
        this.columna = columna;
    }
}
public class Prog2Exam 
{

    public static void main(String[] args) 
    {
        int[][] matriz = 
        {
            {3, 5, 7},
            {2, 9, 4},
            {8, 1, 6}
        };
        Coordenada XY = encontrarMax(matriz);
        System.out.println("El valor máximo está en fila: " + XY.renglon + ", columna: " + XY.columna);
    }
        public static Coordenada encontrarMax(int[][] matriz) 
        {
            int maxValor = matriz[0][0];
            int maxRenglon = 0;
            int maxColumna = 0;

            for (int i = 0; i < matriz.length; i++) 
            {
                 for (int j = 0; j < matriz[i].length; j++) 
                 {
                     if (matriz[i][j] > maxValor) 
                    {
                        maxValor = matriz[i][j];
                        maxRenglon = i;
                        maxColumna = j;
                    }
                }
            }
        return new Coordenada(maxRenglon, maxColumna);
    }
}
