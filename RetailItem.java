public class RetailItem {
    private String name;
    public double price;

    //Constructor
     public RetailItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Prints out a summary of the fields
    public String toString(){
        return "Name: " + name + "\nPrice: $" + price;
    }

    //Gets name
    public String getName(){
        return name;
    }

    //Sets name
    public void setName(String name) {
        this.name = name;
    }

    //Gets price
    public double getPrice(){
        return price;
    }

    //Sets Price
    public void setPrice(double price) {
        this.price = price;
    }


}
