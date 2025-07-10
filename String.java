// Clase Nodo para la cola (guarda enteros)
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

// Clase ColaLigada con operaciones básicas
class ColaLigada {
    private Nodo frente;
    private Nodo fin;

    public ColaLigada() {
        frente = null;
        fin = null;
    }

    // Inserta un número al final de la cola
    public boolean insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        return true;
    }

    // Elimina el número al frente de la cola
    public boolean eliminar() {
        if (estaVacia()) {
            return false;
        }
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return true;
    }

    // Muestra los elementos de la cola
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            Nodo actual = frente;
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }
}