public class PatronDeDiseñoSingleton {
    // Declaración de la única instancia de la clase
    private static PatronDeDiseñoSingleton instance;

    // Constructor privado para evitar la creación de nuevas instancias
    private PatronDeDiseñoSingleton() {
        System.out.println("La instancia PatronDeDiseñoSingleton ha sido creada.");
    }

    // Método estático que proporciona el acceso a la única instancia
    public static PatronDeDiseñoSingleton getInstance() {
        if (instance == null) {
            instance = new PatronDeDiseñoSingleton();
        }
        return instance;
    }

    // Método de ejemplo para mostrar el nombre de la clase
    public void mostrarNombreClase() {
        System.out.println("Esta es la clase PatronDeDiseñoSingleton.");
    }
}
