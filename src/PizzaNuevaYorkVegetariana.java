import java.util.Arrays;

public class PizzaNuevaYorkVegetariana extends Pizza {
    public PizzaNuevaYorkVegetariana() {
        nombre = "Pizza Vegetariana estilo Nueva York";
        masa = "Masa integral delgada";
        salsa = "Salsa marinara";
        ingredientes = Arrays.asList("Queso mozzarella", "Pimientos", "Cebolla", "Champiñones", "Aceitunas");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando " + nombre + " durante 16 minutos en el horno");
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
