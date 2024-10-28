public abstract class Pizzeria {
    public Pizza ordenarPizza(String tipo) {
        Pizza pizza = crearPizza(tipo);

        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();

        return pizza;
    }

    // Factory method
    protected abstract Pizza crearPizza(String tipo);
}
