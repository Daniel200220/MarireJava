public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("mare", 1, 2, 1);
        Pizza pizza2 = new Pizza("medie", 0, 1, 3);
        pizzaOrder order = new pizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        System.out.println("Total cost: $" + order.calcTotal());
    }
}
