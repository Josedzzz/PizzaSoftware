public class PizzeriaNuevaYork extends Pizzeria {
    @Override
    protected Pizza crearPizza(String tipo) {
        switch (tipo.toLowerCase()) {
            case "vegetariana":
                return new PizzaNuevaYorkVegetariana();
            case "peperoni":
                return new PizzaNuevaYorkPeperoni();
            case "italiana":
                return new PizzaNuevaYorkItaliana();
            default:
                throw new IllegalArgumentException("Pizza no disponible en Nueva York.");
        }
    }
}
