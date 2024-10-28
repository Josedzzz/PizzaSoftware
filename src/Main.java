public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeriaNY = new PizzeriaNuevaYork();
        Pizzeria pizzeriaCA = new PizzeriaCalifornia();

        // Aqui quemo los pedidos para mostrar que funciona
        Pizza pizza1 = pizzeriaCA.ordenarPizza("queso");
        System.out.println("Pedido: " + pizza1.nombre + "\n");

        Pizza pizza3 = pizzeriaNY.ordenarPizza("peperoni");
        System.out.println("Pedido: " + pizza3.nombre + "\n");
    }
}