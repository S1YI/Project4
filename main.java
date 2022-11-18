import com.sun.source.tree.LambdaExpressionTree;

public class main {
    public static void main(String[] args) {

        //Objects
        Book book = new Book("John", 15.99, "Mobey");
        RetailItem item = new RetailItem("John",14.99);
        VideoGame game = new VideoGame("Minecraft", 30.99, "Java");

        //Array
        RetailItem[] shoppingCart = {book,item,game};


        //Calls Register
        CashRegister.Checkout(shoppingCart);

    }
}
