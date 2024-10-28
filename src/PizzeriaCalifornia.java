public class PizzeriaCalifornia extends Pizzeria {
    @Override
    protected Pizza crearPizza(String tipo) {
        switch (tipo.toLowerCase()) {
            case "vegetariana":
                return new PizzaCaliforniaVegetariana();
            case "queso":
                return new PizzaCaliforniaQueso();
            case "peperoni":
                return new PizzaCaliforniaPeperoni();
            default:
                throw new IllegalArgumentException("Pizza no disponible en California.");
        }
    }
}
