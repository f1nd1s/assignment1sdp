public class main {
    public static void main(String[] args){
        Product foodProduct = new FoodProduct(100);
        Product electronicsProduct = new ElectronicsProduct(900);
        Product carRentalProduct = new CarRentalProduct(1000, 5);

        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Food discount: $" + calculator.calculateDiscount(foodProduct));
        System.out.println("Electronics discount: $" + calculator.calculateDiscount(electronicsProduct));
        System.out.println("Car rental discount: $" + calculator.calculateDiscount(carRentalProduct));
    }
}
