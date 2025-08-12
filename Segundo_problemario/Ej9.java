package Segundo_problemario;

public class Ej9 {
    static class Nodo {
        int dato;
        Nodo siguiente;
        
        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
        
        public Nodo(int dato, Nodo siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }
    }

    static class Cola {
        private Nodo frente;
        private Nodo fin;

        public void insertaOrdR(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (frente == null || dato <= frente.dato) {
                nuevo.siguiente = frente;
                frente = nuevo;
                if (fin == null) fin = frente;
            } else {
                Nodo actual = frente;
                while (actual.siguiente != null && actual.siguiente.dato < dato) {
                    actual = actual.siguiente;
                }
                nuevo.siguiente = actual.siguiente;
                actual.siguiente = nuevo;
                if (nuevo.siguiente == null) fin = nuevo;
            }
        }

        public Cola clonar() {
            Cola clon = new Cola();
            Nodo actual = frente;
            while (actual != null) {
                clon.insertaOrdR(actual.dato);
                actual = actual.siguiente;
            }
            return clon;
        }

        public boolean iguales(Cola otra) {
            if (this.frente == null && otra.frente == null) return true;
            if (this.frente == null || otra.frente == null) return false;
            if (this.frente.dato != otra.frente.dato) return false;
            
            int datoThis = this.frente.dato;
            this.frente = this.frente.siguiente;
            boolean resultado = this.iguales(otra);
            this.frente = new Nodo(datoThis, this.frente);
            return resultado;
        }

        public Nodo ultimo() {
            return fin;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Nodo actual = frente;
            while (actual != null) {
                sb.append(actual.dato);
                if (actual.siguiente != null) sb.append(", ");
                actual = actual.siguiente;
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Cola c = new Cola();
        c.insertaOrdR(20);
        c.insertaOrdR(10);
        c.insertaOrdR(15);
        c.insertaOrdR(30);
        System.out.println(c); // [10, 15, 20, 30]
        
        Cola c2 = c.clonar();
        System.out.println(c.iguales(c2)); // true
        
        c2.insertaOrdR(5);
        System.out.println(c.iguales(c2)); // false
        
        Nodo aux;
        System.out.println((aux = c.ultimo()) == null ? null : aux.dato); // 30
        
        Cola c3 = new Cola();
        System.out.println((aux = c3.ultimo()) == null ? null : aux.dato); // null
    }
}
