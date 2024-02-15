import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws ParseException {
        Customer c1 = new Customer("Sovisal", "Premium");
        Customer c2 = new Customer("Sokchea", "Gold");
        Customer c3 = new Customer("Sokpov", "Silver");
        Customer c4 = new Customer("Vitou", "Gold");


        Sale sale_c1 = new Sale(c1, "2024-02-11");
        Sale sale_c2 = new Sale(c2, "2024-02-12");
        Sale sale_c3 = new Sale(c3, "2024-02-13");
        Sale sale_c4 = new Sale(c4, "2024-02-14");

        sale_c1.setProductExpense(100);
        sale_c1.setServiceExpense(100);
        sale_c1.displayInfo();

        sale_c2.setProductExpense(100);
        sale_c2.setServiceExpense(100);
        sale_c2.displayInfo();

        sale_c3.setProductExpense(100);
        sale_c3.setServiceExpense(100);
        sale_c3.displayInfo();

        sale_c4.setProductExpense(100);
        sale_c4.setServiceExpense(100);
        sale_c4.displayInfo();
    }
}
