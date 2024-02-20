package LabAssignment3;

public class GCash implements PaymentMode {
    private static final double discountRate = 0.02;

    @Override
    public double determineDiscountRate() {
        return discountRate;
    }
}

