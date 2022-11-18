public class VideoGame extends RetailItem{
    private String developer;


     public VideoGame(String name, double price, String developer) {
        super(name, price);
        this.developer = developer;
    }

    @Override
    public String toString(){
        return "Name: " + super.getName() + "\nPrice: $" + super.getPrice() + "\nDeveloper: " + developer;
    }
}
