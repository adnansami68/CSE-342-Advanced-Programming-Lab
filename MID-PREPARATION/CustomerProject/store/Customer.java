package store;

public class Customer {
    private String customerName;
    private int customerId;
    private int loyaltyScore;

    // Default constructor
    public Customer() {
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setLoyaltyScore(int loyaltyScore) {
        if (loyaltyScore >= 0 && loyaltyScore <= 100) {
            this.loyaltyScore = loyaltyScore;
        } else {
            System.out.println("Invalid score. Must be between 0 and 100.");
        }
    }

    public int getLoyaltyScore() {
        return loyaltyScore;
    }

    public String calculateLoyaltyTier() {
        if (loyaltyScore >= 80 && loyaltyScore <= 100) {
            return "Platinum";
        } else if (loyaltyScore >= 60 && loyaltyScore <= 79) {
            return "Gold";
        } else if (loyaltyScore >= 40 && loyaltyScore <= 59) {
            return "Silver";
        } else {
            return "Bronze";
        }
    }
}
