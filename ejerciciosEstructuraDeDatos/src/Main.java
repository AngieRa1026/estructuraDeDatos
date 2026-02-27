public class Main {
    public static void main(String[] args) {

        ListaContactos lista = new ListaContactos();

        lista.insertarFinal(
            new Contacto("Juan", "123456789", "juan@email.com"));

        lista.insertarFinal(
            new Contacto("María", "987654321", "maria@email.com"));
        lista.insertarFinal(
            new Contacto("Pedro", "555555555", "pedro@email.com"));


        System.out.println("Lista Actual");
        lista.listarContactos();

        System.out.println("Buscando contacto: " + lista.buscarContacto("Juan"));
        lista.eliminarContacto("Juan");
        
        System.out.println("Después de eliminar a Juan:");
        lista.listarContactos();
    }
}