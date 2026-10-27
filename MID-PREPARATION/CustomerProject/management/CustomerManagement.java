package management;
import store.Customer;

public class CustomerManagement {
     public static void main(String[] args) {
          Customer c1 = new Customer();
          Customer c2 = new Customer();
          Customer c3 = new Customer();

          c1.setCustomerName("Jahid");
          c1.setCustomerId(101);
          c1.setLoyaltyScore(88);

          c2.setCustomerName("Adnan");
          c2.setCustomerId(102);
          c2.setLoyaltyScore(70);

          c3.setCustomerName("Fahim");
          c3.setCustomerId(103);
          c3.setLoyaltyScore(50);

          System.out.println("Customer Name is " + c1.getCustomerName());
          System.out.println("Customer ID is " + c1.getCustomerId());
          System.out.println("Customer loyalty score is " + c1.getLoyaltyScore());
          System.out.println("Category: " + c1.calculateLoyaltyTier());

          System.out.println();

          System.out.println("Customer Name is " + c2.getCustomerName());
          System.out.println("Customer ID is " + c2.getCustomerId());
          System.out.println("Customer loyalty score is " + c2.getLoyaltyScore());
          System.out.println("Category: " + c2.calculateLoyaltyTier());

          System.out.println();

          System.out.println("Customer Name is " + c3.getCustomerName());
          System.out.println("Customer ID is " + c3.getCustomerId());
          System.out.println("Customer loyalty score is " + c3.getLoyaltyScore());
          System.out.println("Category: " + c3.calculateLoyaltyTier());
     }
}
