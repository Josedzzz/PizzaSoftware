import java.util.Arrays;

public class PizzaCaliforniaPeperoni extends Pizza {
    public PizzaCaliforniaPeperoni() {
        nombre = "Pizza Pepperoni estilo California";
        masa = "Masa comun";
        salsa = "Salsa de tomate";
        ingredientes = Arrays.asList("Queso mozzarella", "Pepperoni artesanal", "Pimientos verdes");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando " + nombre + " durante 12 minutos en horno");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando " + nombre + " en 6 pedazos");
    }

    @Override
    public void empaquetar() {
        System.out.println("Empaquetando " + nombre);
    }
}
