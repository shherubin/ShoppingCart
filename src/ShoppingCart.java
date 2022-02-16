import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String input = "";
        System.out.println("Welcome to Pierre's store. Please choose what items you'd like from the list below. Some items may not be in stock.");

        String list[] = {"1.Nintendo Switch - $299.99 ",
                "2.Xbox Series X - $499.99 ",
                "3.PS5 - $499.99 ",
                "4.Samsung Q60A TV - $440.00 ",
                "5.Apple Watch - #399.99 ",
                "6.GTX3070 - $499.99 "
        };


        //example item
        Item nintendoSwitch = new Item(1, "Nintendo Switch", 299.99);

        boolean addFlag = true;

        while(addFlag == true){
            //add logic
        }

        boolean deleteFlag = true;

        while(deleteFlag == true){
            //delete logic
        }
    }
}



