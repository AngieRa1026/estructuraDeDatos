public class ListaContactos {
    private Nodo cabeza;
    public ListaContactos() {
        this.cabeza = null;
    }

    public void insertarFinal(Contacto contacto) {
        Nodo nuevo = new Nodo(contacto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Contacto buscarContacto(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getNombre().equals(nombre)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null; // No encontrado
    }

    public void mostrarContactos() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    public boolean eliminarContacto(String nombre) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.getDato().getNombre().equals(nombre)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().getNombre().equals(nombre)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    public void listarContactos() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}