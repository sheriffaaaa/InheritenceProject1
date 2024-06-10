public class RegularCustomer extends Customer
{
    private double discount; 
    
    public RegularCustomer(int id, double price,int qty, double disc) 
    {
       super(id,price, qty);
       this.discount = disc;
        
    }
    
    public double getDiscount()
    {
       return this.discount;
    }
    
    public String toString()
    {
        return super.toString()+ "\n Discount: " +this.getDiscount();
    } 
}

//public class Main {
    //public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        // Create a Customer object
        //System.out.print("Enter customer name: ");
        //String name = scanner.nextLine();
        //System.out.print("Enter price: ");
        //double price = scanner.nextDouble();
        //System.out.print("Enter quantity: ");
        //int quantity = scanner.nextInt();
        //scanner.nextLine(); // Consume newline character

       // Customer C = new Customer();
        //C.name = name;
        //C.price = price;
        //C.quantity = quantity;

        // Create a RegularCustomer object
        //System.out.print("Enter regular customer name: ");
        //name = scanner.nextLine();
        //System.out.print("Enter price: ");
        //price = scanner.nextDouble();
        //System.out.print("Enter quantity: ");
        //quantity = scanner.nextInt();
        //System.out.print("Enter discount (e.g., 0.5 for 50%): ");
        //double discount = scanner.nextDouble();
        //scanner.nextLine(); // Consume newline character

        //RegularCustomer R = new RegularCustomer();
        //R.name = name;
        //R.price = price;
        //R.quantity = quantity;
        //R.discount = discount;

        // Display total price for C and R objects
        //System.out.println("\nTotal Price for Customer C: " + C.getTotalPrice());
        //System.out.println("Total Price for Regular Customer R: " + R.getTotalPrice());

        // Display discounted price for R object
        //System.out.println("Discounted Price for Regular Customer R: " + R.getDiscountedPrice());

        // Display details of C and R objects using toString() method
        //System.out.println("\nCustomer C details:");
        //System.out.println(C);

        //System.out.println("\nRegular Customer R details:");
        //System.out.println(R);
    //}
//}

