package LabAssignment3;

public class ShopeePay implements PaymentMode {
    private static final double discountRate = 0.10;

    @Override
    public double determineDiscountRate() {
        return discountRate;
    }
}
