import java.util.*;
import java.util.ArrayList;
class Item{
    private String name;
    private int price;
    private String info;

    static Scanner sc = new Scanner(System.in);
    
   public Item(String name, int price, String info){
       this.name = name;
       this.price = price;
       this.info = info;
   }
   public String getName(){
       return name;
   }
   public int getPrice(){
       return price;
   }

    public static void descItem(Item items){
        System.out.println();
        System.out.println("Item :" +items.getName());
        System.out.println("Price :" +items.getPrice());
        System.out.println();
    }

}