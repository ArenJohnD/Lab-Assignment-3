package LabAssignment3;

public class Maya implements PaymentMode {
    private static final double discountRate = 0.05;

    @Override
    public double determineDiscountRate() {
        return discountRate;
    }
}
