package engsoft;

public class Bebida implements ItemCombo {
    private final String name;
    private final double price;

    public Bebida (String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (R$ %.2f)", name, price);
    }

}
