import java.util.Arrays;

public class PizzaCaliforniaQueso extends Pizza {
    public PizzaCaliforniaQueso() {
        nombre = "Pizza de Queso estilo California";
        masa = "Masa suave";
        salsa = "Salsa blanca de ajo";
        ingredientes = Arrays.asList("Queso mozzarella", "Queso cheddar", "Queso parmesano");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando " + nombre + " durante 6 minutos en el horno");
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
