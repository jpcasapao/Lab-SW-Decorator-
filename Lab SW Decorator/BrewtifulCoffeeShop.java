public class BrewtifulCoffeeShop {
    public static void main(String[] args) {
        // Order 1: Simple Black Coffee
        Coffee order1 = new BlackCoffee();
        printOrder(order1);

        // Order 2: Espresso + Milk + Caramel Syrup
        Coffee order2 = new CaramelSyrup(
                            new Milk(
                                new Espresso()));
        printOrder(order2);

        // Order 3: Latte + Double Sugar + Whipped Cream + Vanilla
        Coffee order3 = new VanillaSyrup(
                            new WhippedCream(
                                new Sugar(
                                    new Sugar(
                                        new Latte()))));
        printOrder(order3);

        // Order 4: Black Coffee + Milk + Sugar + Caramel + Whipped Cream
        Coffee order4 = new WhippedCream(
                            new CaramelSyrup(
                                new Sugar(
                                    new Milk(
                                        new BlackCoffee()))));
        printOrder(order4);
    }

    public static void printOrder(Coffee coffee) {
        System.out.printf("Order: %s | Total Cost: ₱%.2f%n",
                coffee.getDescription(), coffee.getCost());
        System.out.println("─".repeat(50));
    }
}