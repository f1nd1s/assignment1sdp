public class CarRentalProduct implements Product {
    private double pricePerDay;
    private int rentalDays;

    public CarRentalProduct(double pricePerDay, int rentalDays) {
        this.pricePerDay = pricePerDay;
        this.rentalDays = rentalDays;
    }

    @Override
    public double getPrice() {
        return pricePerDay * rentalDays;
    }

    @Override
    public double getDiscount() {
        return getPrice() * 0.2;
    }
}