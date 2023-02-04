public class pizzaOrder {
    private Pizza[] pizzas;
    private int pizzaCount;

    public pizzaOrder() {
        pizzas = new Pizza[3];
        pizzaCount = 0;
    }

    public void addPizza(Pizza pizza) {
        if (pizzaCount < 3) {
            pizzas[pizzaCount] = pizza;
            pizzaCount++;
        } else {
            System.out.println("Nu puteti adauga mai mult de 3 pizza.");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < pizzaCount; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }
}
