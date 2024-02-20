package LabAssignment3;

public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    private PaymentMode mode;

    public Order(String item, int quantity, double unitPrice, PaymentMode mode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.mode = mode;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public double getTotalAmount() {
        double totalAmount = quantity * unitPrice;
        double discount = mode.determineDiscountRate() * totalAmount;
        return totalAmount - discount;
    }
}