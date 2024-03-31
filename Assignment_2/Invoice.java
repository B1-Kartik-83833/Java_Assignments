public class Invoice
{
    private String number;
    private String description;
    private int quantity;
    private double price;

    Invoice(String number, String description, int quantity, double price)
    {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    String getNumber()
    {
        return number;
    }
    void setNumber(String number)
    {
        this.number = number;
    }
    String getDescription()
    {
        return description;
    }
    void setDescription()
    {
        this.description = description;
    }
    void setQuantity(int quantity)
    {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }
    void setPrice(double price)
    {
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }
    double getInvoiceAmount()
    {
        return quantity * price;
    }

        public static void main(String[] args)
        {
            Invoice invoice= new Invoice("123","Hammer",10,80.00);
            System.out.println("Number: " + invoice.getNumber());
            System.out.println("Description: " + invoice.getDescription());
            System.out.println("Quantity: " + invoice.quantity);
            System.out.println("Price Per Item: " + invoice.price);
        }
}