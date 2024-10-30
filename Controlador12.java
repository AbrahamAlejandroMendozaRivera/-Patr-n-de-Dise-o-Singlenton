public class Controlador12 {
    public static void main(String[] args) {
        // Obtener la instancia única de PatronDeDiseñoSingleton
        PatronDeDiseñoSingleton singleton = PatronDeDiseñoSingleton.getInstance();
        
        // Llamar al método para mostrar el nombre de la clase
        singleton.mostrarNombreClase();
    }
}
