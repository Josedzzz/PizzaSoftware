import java.util.Arrays;

public class PizzaNuevaYorkPeperoni extends Pizza {
    public PizzaNuevaYorkPeperoni() {
        nombre = "Pizza Pepperoni estilo Nueva York";
        masa = "Masa delgada";
        salsa = "Salsa de ajo";
        ingredientes = Arrays.asList("Queso mozzarella", "Pepperoni", "Orégano");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando " + nombre + " durante 17 minutos en el horno");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando " + nombre + " en 8 pedazos");
    }

    @Override
    public void empaquetar() {
        System.out.println("Empaquetando " + nombre);
    }
}
