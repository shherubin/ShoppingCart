import java.util.Arrays;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String input = "";
        boolean moreItems = true;
        System.out.println("Welcome to Pierre's store. Please choose what items you'd like from the list below. Some items may not be in stock.");

        String list[] = {"1.Nintendo Switch - $299.99 ", "2.Xbox Series X - $499.99 ", "3.PS5 - $499.99 ", "4.Samsung Q60A TV - $440.00 ", "5.Apple Watch - $399.99 ", "6.GTX3070 - $499.99 "};

        String[] cart = new String[10]; // all items are null right now

        Item nintendoSwitch = new Item(1, "Nintendo Switch", 299.99);
        Item xboxSeriesX = new Item ( 2, "Xbox Series X", 499.99);
        Item ps5 = new Item ( 3, "PS5", 499.99);
        Item samsungq60atv = new Item (4, "Samsung Q60 TV", 440.00);
        Item appleWatch = new Item ( 5, "Apple Watch", 399.99);
        Item gtx3070 = new Item ( 6, "GTX3070", 499.99 );

        Item [] newItemList = {nintendoSwitch , xboxSeriesX , ps5 , samsungq60atv , appleWatch , gtx3070 };

        String [] itemList = new String[6];

        System.out.println(itemList);
        //TODO: I want you to create an Item Object (What I did on line 13) for the rest of the list on line 10
        //TODO: I want you to create an Item Array then and put every item from the list into the Item Array


        /**
         * Note: Arrays are ObjectType [] variableName = new ObjectType[size];
         */

        //This is an example of how to print out everything in an array
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }

        /**
         * Note on comparison checks:
         *  while(addFlag == true) { ...code to execute }
         *  OR
         *  while(addFlag) { ...code to execute }
         *
         *  while(addFlag == false) { ...code to execute }
         *  OR
         *  while(!addFlag) { ...code to execute }
         * */

        boolean addFlag = true;

        while(addFlag == true){
            System.out.println("Please enter a item number to add it to your cart.");
            input = stdin.nextLine();
            int itemIndex = Integer.parseInt(input);
            for (int i = 0; i < cart.length; i++){
                if(cart[i] == null){ // this looks at the spot if the spot is empty
                    cart[i] = list[itemIndex - 1]; // since empty then we'll add the item there
                    break; //stop the for loop since we've found the empty space
                } // else we don't care because we assume the space is full (for now...)
            }
            System.out.println("You've added " + list[itemIndex - 1] + " to your cart.\n");
            for (int i = 0; i < list.length; i++) {
                if (cart[i] != null) {
                    System.out.println("Current cart has " + cart[i]);
                }
            }

            System.out.println("\nWould you like to add more items to the cart?");
            String addResponse = stdin.nextLine();
            if(addResponse.equalsIgnoreCase("no")){
                addFlag = false;
            } else if (addResponse.equalsIgnoreCase("yes")){
                System.out.println("Awesome! You have a lot of money. ");
                addFlag = true;
            }
        }

        boolean deleteFlag = true;

        while(deleteFlag = true) {
            System.out.println("Please enter a item number to delete it from your cart.");
            input = stdin.nextLine();
            int itemIndex = Integer.parseInt(input) - 1; //this is index of the item they want to remove from the cart
            System.out.println("You've removed " + cart[itemIndex] + " from your cart."); //getting a specific item from the cart is done with this
//            cart[0] = list[index - 1]; This assigns the item from the list to cart[0] which is incorrect we don't want to "replace" that item
            cart[itemIndex] = null; // This removes the "item" currently at the index and sets it to null
            for (int i = 0; i < cart.length; i++) {
                if (cart[i] != null) {
                    System.out.println("Cart is now: " + cart[i]);
                }
            }
            //TODO: Edit this to do multiple deletes
            deleteFlag = false;
            System.out.println("Would you like to delete more?");
            input = stdin.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                deleteFlag = true;
            } else if (input.equalsIgnoreCase("no")) {
                deleteFlag = false;
                System.out.println("Sounds good chief, let's checkout.");
            }
        }


//        for(int c = 0; c < cart.length; c++) {
//            System.out.println("Please enter a item number to add it to your cart.");
//            input = stdin.nextLine();
//            int itemIndex = Integer.parseInt(input);
//            cart[0] = list[itemIndex - 1];
//            System.out.println("You've chosen " + cart[0]);
//            System.out.println("Would you like to ");
//            input = stdin.nextLine();
//            if (input.equalsIgnoreCase("yes")) {
//                System.out.println("Please select another item.");
//                input = stdin.nextLine();
//                itemIndex = Integer.parseInt(input);
//                cart[1] = list[itemIndex - 1];
//                System.out.println("You have chosen " + cart[1]);
//                for (int i = 0; i < list.length; i++) {
//                    if (cart[i] != null) {
//                        System.out.println("Current cart has " + cart[i]);
//                    }
//                }
//                System.out.println("Would you like to checkout?");
//                input = stdin.nextLine();
//                if (input.equalsIgnoreCase("yes")) {
//                    System.out.println("Would you like to delete any items?");
//                    input = stdin.nextLine();
//                    if (input.equalsIgnoreCase("yes"))
//                        for (int i = 0; i < list.length; i++) {
//                            if (cart[i] != null) {
//                                System.out.println("Current cart has " + cart[i]);
//                                System.out.println("Pick an item to delete");
//                                input = stdin.nextLine();
//
//
//                } else if (input.equalsIgnoreCase("no")) ;
//                System.out.println("Would you like to delete an item from your cart?");
//                input = stdin.nextLine();
//                if (input.equalsIgnoreCase("yes")) ;
//                System.out.println("Please pick an item to delete.");
//                System.out.println(cart[c]);
//
//
//            }

//        System.out.println(list [0] + list[1] + list[2] + list[3] + list[4] + list[5]);
//        System.out.println("Please enter a item number to add it to your cart.");
//        input = stdin.nextLine();
//        System.out.println("You have added item number " + input + " to your cart. \n Would you like to add more items? Yes or No?");
//        input = stdin.nextLine();
            //int cart;
//        for(int cart = 1; cart <= (6); cart++) {
//            if (input.equalsIgnoreCase("yes")){
//                System.out.println("Please select another item.");
//                input = stdin.nextLine();
//                System.out.println("You have added item number " + input + " to your cart.");
//                System.out.println("You have " + cart + " items in your cart.");
//                System.out.println("Would you like to add more?");
//                input = stdin.nextLine();
//            }
//            if (input.equalsIgnoreCase("yes")){
//            }else if (input.equalsIgnoreCase("no"));{
//                cart = 6;}
//
//        /*for (int i = 0; i < 5; i++){
//            System.out.println("Would you like to buy more?"
//            );
//            input.stdin.nextLine();
//            if(input.equalsIgnoreCase("Yes"));
//
//         */
//        /*for (String electronics : array) {
//        System.out.println(electronics);
//        }
//         how to write the above line
//        System.out.println("Please enter the number of your items.");
//        System.out.println(prices[0]);
//        input = stdin.nextLine();
//        customerCart = "";
//        input = stdin.nextLine();
//        System.out.println(customerCart);
//        System.out.println("You have added" + input);
//        System.out.println("The total for your items is" + stdin);
//        if(customerCart.equals("2")){
//            System.out.println("Oops looks like one of your items is not in stock.");
//        } else if (customerCart.equals("3")) {
//            System.out.println("Oops looks like one of your items is not in stock.");
//        }
//        else {
//
//            System.out.println("Looks like all your items are in stock!");*/
//              }
//        }

    }
}



