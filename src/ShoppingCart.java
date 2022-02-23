import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String input = "";
        System.out.println("Welcome to Pierre's store. Please choose what items you'd like from the list below. Some items may not be in stock.");

        List<Item> itemShelf = new ArrayList<>();
        List<Item> cart = new ArrayList<>();
        //example item
        Item nintendoSwitch = new Item(1, "Nintendo Switch", 299.99);
        Item xboxSeriesX = new Item(2, "Xbox Series X", 499.99);
        Item ps5 = new Item(3, "PS5", 499.99);
        Item samsungQ60atv = new Item(4, "Samsung Q60A", 440.00);
        Item appleWatch = new Item(5, "Apple Watch", 399.99);
        Item gtx3070 = new Item(6, "GTX3070", 499.99);

        itemShelf.add(nintendoSwitch);
        itemShelf.add(xboxSeriesX);
        itemShelf.add(ps5);
        itemShelf.add(samsungQ60atv);
        itemShelf.add(appleWatch);
        itemShelf.add(gtx3070);


        boolean addFlag = true;
        for (int i = 0; i < itemShelf.size(); i++) {
            System.out.println(itemShelf.get(i).toString());
        }


        //add logic
        System.out.println("Please select the quantity of items you would like to add to your cart.");
//        String[] quantityToCart = new String[stdin.nextInt()];
//        stdin.nextLine();
//        for (int i = 0; i < quantityToCart.length; i++) {
//            quantityToCart[i] = stdin.nextLine();
            System.out.println("Please select an item ID number to add it to your cart.");
            input = stdin.nextLine();
            cart.add(itemShelf.get(Integer.parseInt(input) - 1));
        System.out.println("You've entered" + input);

            boolean deleteFlag = true;
            //   while(deleteFlag == true){
            //delete logic

    }
}




