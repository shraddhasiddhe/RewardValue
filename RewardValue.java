package main.java;

public class RewardValue {
    private double value;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.value = cashValue;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.value = milesValue * MILES_TO_CASH_RATE;
        } else {
            this.value = milesValue;
        }
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return this.value;
    }

    // Method to get the miles value of the RewardValue
    public double getMilesValue() {
        return this.value / MILES_TO_CASH_RATE;
    }

    public static void main(String[] args) {
        // Example usage
        RewardValue cashValue = new RewardValue(100);
        System.out.println("Cash value: $" + cashValue.getCashValue());
        System.out.println("Miles value: " + cashValue.getMilesValue() + " miles");

        RewardValue milesValue = new RewardValue(10000, true);
        System.out.println("Cash value: $" + milesValue.getCashValue());
        System.out.println("Miles value: " + milesValue.getMilesValue() + " miles");
    }
}
