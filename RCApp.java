import java.util.Scanner;

public class RCApp
{
    public static void main ( String [] args )
    {
        Scanner in = new Scanner (System.in);
        Scanner inline = new Scanner (System.in);
        
        
        System.out.println("CUSTOMER");
        System.out.println("Enter the following info. ");
        System.out.print("ID: ");
        int id = in.nextInt();
        System.out.print("Price: RM ");
        double p = in.nextDouble();
        System.out.print("Qty: ");
        int q = in.nextInt();
        
        Customer C = new Customer ( id, p , q);
        
        System.out.println("REGULAR CUSTOMER");
        System.out.println("Enter the following info. ");
        System.out.print("ID: ");
        id = in.nextInt();
        System.out.print("Price: RM ");
        p = in.nextDouble();
        System.out.print("Discount (%): ");
        double d= in.nextDouble();
        
        RegularCustomer R = new RegularCustomer( id, p , q, d);
        
        System.out.println();
        System.out.println("Total price for C : RM" +C.getPrice() * C.getQty());
        double tPriceR = R.getPrice() * R.getQty();
        System.out.println ("Total Price for R : RM" + tPriceR);
        
        System.out.println();
        double discountR = tPriceR * R.getDiscount();
        double tPriceAfterDisc = tPriceR - discountR;
        System.out.println("New Total Price for R after discount : " +tPriceAfterDisc);
        
        System.out.println();
        System.out.println("CUSTOMER");
        System.out.println(C.toString());
        System.out.println();
        System.out.println("REGULAR CUSTOMER");
        System.out.println(R.toString());
        System.out.println("Total Price: RM " +tPriceAfterDisc);
        
    }
    
    
    
   
}



