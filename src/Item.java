public class Item {
    private int id;
    private String name;
    private double price;

    //This is an empty constructors
    public Item(){}

    //This is a constructor that creates the item by getting there user's input.
    public Item(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
