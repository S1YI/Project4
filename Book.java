public class Book extends RetailItem{
    private String author;


     public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String toString(){
        return "Name: " + super.getName() + "\nPrice: $" + super.getPrice() + "\nAuthor: " + author;
    }



}
