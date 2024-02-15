import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Sale {
    Customer customer;
    String date;
    double productExpense;
    double serviceExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void displayInfo() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date saleDate = dateFormat.parse(date);
        SimpleDateFormat dateFormatOutput = new SimpleDateFormat("MMMM dd, yyyy");

        System.out.println("Customer Name: " + customer.name);
        System.out.println("Customer Type: " + customer.type);
        System.out.println("Sale Date: " + dateFormatOutput.format(saleDate));
        System.out.println("Product Expense: $" + productExpense);
        System.out.println("Service Expense: $" + serviceExpense);

        double totalExpense = productExpense + serviceExpense;
        double productDiscountRate = customer.getProductDiscountRate(customer.type);
        double serviceDiscountRate = customer.getServiceDiscountRate(customer.type);

        double productDiscountAmount = productExpense * productDiscountRate;
        double serviceDiscountAmount = serviceExpense * serviceDiscountRate;
        double totalDiscount = productDiscountAmount + serviceDiscountAmount;
        double discountedTotal = totalExpense - totalDiscount;

        System.out.println("Product Discount Amount: $" + productDiscountAmount);
        System.out.println("Service Discount Amount: $" + serviceDiscountAmount);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Discounted Total: $" + discountedTotal);
        System.out.println();
    }
}