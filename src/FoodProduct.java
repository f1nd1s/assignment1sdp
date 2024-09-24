public class FoodProduct implements Product {
    private double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;
    }
}