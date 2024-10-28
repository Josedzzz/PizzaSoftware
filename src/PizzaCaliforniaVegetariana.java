import java.util.Arrays;

public class PizzaCaliforniaVegetariana extends Pizza {
    public PizzaCaliforniaVegetariana() {
        nombre = "Pizza Vegetariana estilo California";
        masa = "Masa crujiente";
        salsa = "Salsa de tomate";
        ingredientes = Arrays.asList("Queso", "Espinaca", "Tomate", "Aceitunas", "Pimientos rojos asados");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando " + nombre + " durante 12 minutos en el horno");
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
