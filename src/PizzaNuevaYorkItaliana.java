import java.util.Arrays;

public class PizzaNuevaYorkItaliana extends Pizza {
    public PizzaNuevaYorkItaliana() {
        nombre = "Pizza Italiana estilo Nueva York";
        masa = "Masa delgada";
        salsa = "Salsa de tomate fresco";
        ingredientes = Arrays.asList("Queso mozzarella fresco", "Tomates", "Aceite de oliva", "Orégano");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando " + nombre + " durante 15 minutos en el horno");
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
