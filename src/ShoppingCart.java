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



        for (int i = 0; i < itemShelf.size(); i++) {
            System.out.println(itemShelf.get(i).toString());}

        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i).toString());}



        boolean addFlag = true;

        while (addFlag) {
            System.out.println("Please select an item ID number to add it to your cart.");
            input = stdin.nextLine();
            cart.add(itemShelf.get(Integer.parseInt(input) - 1));
            System.out.println("You've entered " + input);
            System.out.println("Your cart currently contains.. \n " + cart.size() + "\nWould you like to add another item?");
           // System.out.println("Would you like to add another item?");
            input = stdin.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                addFlag = true;
            } else if (input.equalsIgnoreCase("no")) {
                addFlag = false;
            }
        }
        boolean deleteFlag = true;

        while (deleteFlag){
            System.out.println("Your cart includes.. \n " + cart.size() + "\nWould you like to remove any items from your cart?");
            input = stdin.nextLine();
            if(input.equalsIgnoreCase("yes")) {
                System.out.println("Select an item to remove. \n" + cart.size());
                input = stdin.nextLine();
                cart.remove(itemShelf.get(Integer.parseInt(input) - 1));
                //System.out.println("cart now contains" + cart);
            }else if(input.equalsIgnoreCase("no")){
                System.out.println("Please pay at the register.");
                deleteFlag = false;
            }

        }


    }
}




