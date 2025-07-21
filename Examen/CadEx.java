package Examen;
class Nodo 
{
    CadEx dato;
    Nodo siguiente;

    public Nodo(CadEx dato) 
    {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class CadEx
{
    private Nodo frente;
    private Nodo fin;

    public CadEx() 
    {
        frente = null;
        fin = null;
    }
    public boolean encolar(CadEx dato) 
   {
        Nodo nuevo = new Nodo(dato);
        if (nuevo == null) 
        {
            return false;
        }

        if (frente == null) 
        {
            frente = fin = nuevo;
        } else 
        {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        return true;
    }

    public boolean desencolar() 
    {
        if (frente == null) 
        {
            return false;
        }

        Nodo temp = frente;
        frente = frente.siguiente;
        temp.siguiente = null;

        if (frente == null) 
        {
            fin = null;
        }
        return true;
    }

    public CadEx obtenerFrente() 
    {
        if (frente == null) 
        {
            return null;
        }
        return frente.dato;
    }

    public CadEx obtenerFin() 
    {
        if (fin == null) 
        {
            return null;
        }
        return fin.dato;
    }

    public boolean estaVacia() 
    {
        if (frente == null)
        {
            return true;
        }
        return false;
    }

    public void destruir() 
    {
        frente = null;
        fin = null;
    }
}