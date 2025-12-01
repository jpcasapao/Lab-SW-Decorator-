class VanillaSyrup extends CoffeeDecorator {
    public VanillaSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Vanilla Syrup";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 45.00; // ₱45.00
    }
}