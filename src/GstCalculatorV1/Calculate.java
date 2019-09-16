package GstCalculatorV1;

public class Calculate {
    double foodTotal, furnitureTotal;
    private int foodPrice=200, furniturePrice;

    public double calculateFurnitureBill(int furnitureQuantity) {
        furnitureTotal= ((furniturePrice*furnitureQuantity)+(0.05*(furniturePrice*furnitureQuantity)));
        return furnitureTotal;
    }
    public double calculateFoodbill(int foodQuantity) {
        int price=200;
        foodTotal=foodQuantity*foodPrice;
        return foodTotal;
    }
    public double generateBill() {
        return (foodTotal+furnitureTotal);
    }
}

