public class Customer
{
    protected int idNum;
    protected double price;
    protected int quantity;
    
    public Customer (int id, double price, int qty)
    {
        this.idNum= id;
        this.price= price;
        this.quantity= qty;
    }
    
    public int getID()
    {
        return idNum;
    }
    
    public double getPrice ()
    {
        return this.price;
    }
    
    public int getQty ()
    {
        return this.quantity;
    }
    
    public String toString()
    {
        return"Cust ID: "  +this.getID()+
              "\nPrice:RM " +this.getPrice()+
              "\nQuantity: " +this.getQty();
    }
}
