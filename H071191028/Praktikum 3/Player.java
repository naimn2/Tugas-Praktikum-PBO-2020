/*
 * Player
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Player {
    static Scanner pew = new Scanner(System.in);
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;//
    private int money;
    private List <Item> items;

    //constructor untuk memberi nilai awal
    public Player(String name, String role){
        this.name = name;
        this.role = role;
        hp = 100;
        level = 0;
        damage = 10;
        energy = 100;
        money = 100;
        items = new ArrayList<>();
        items.add(new Item("Hp Potion", 20, "+20 Hp"));
        items.add(new Item("Hp Potion", 20, "+20 Hp"));

    }
    //
    public List<Item> getItem(){
        return items;
    }
    //
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }

    public void showStatus(){
        System.out.println();
        System.out.println("+-----------------------------+");
        System.out.println("Name " + name);
        System.out.println("Role " + role);
        System.out.println("Level " + level);
        System.out.println("Hp " + hp);
        System.out.println("Attack Power " + damage);
        System.out.println("Energy " + energy);
        System.out.println("Money " + money);
        System.out.println("+-----------------------------+");
        System.out.println();
    }

    
    public void showItems(){
        System.out.println();
        for (int i = 1; i < items.size(); i++) {
            Item.descItem(items.get(i));
        }
        
        System.out.println();
    }
    public void sell(int count){
        int jual = items.get(count).getPrice();
        System.out.println("Sell this item?");
        String answer = pew.next().toLowerCase();
        if(answer.equals("yes")){
            items.remove(count);
            money += 20;
        }
        
    }

    public void attack(Player player){
        player.hp -= damage;
        energy -= 10;
    }
    

    public boolean dead(Player player){
        if(player.hp <= 0){
            return true;
        }else{
            return false;
        }
    }

    public void healing(Player player){
        if(!dead(player)){
            if((player.hp + 20) >= 100){
                player.hp = 100;
                System.out.println("Hp max!");
            }else{
                for (int i = 0; i < items.size(); i++) {
                    if(items.size()>0){

                        player.hp += 20;
                        break;
                    }
                    else{
                        System.out.println("no Hp potion");
                    }
                }
            }
        }
    }

    public void buy(Player player, int count){
        if(!dead(player)){
            if(money >= 20){
                if (count==1)
                items.add(new Item("Hp Potion", 20, ""));
                money -= 20;
                System.out.println("\n-Hp potion bertambah 20-");
                // for (int i = 1; i < count; i++) {
                //     items.add(new Item("Hp Potion", 20, ""));
                //     money -= 20;
                //     System.out.println("\n-Hp potion bertambah 20-");
                // }
            }else{
                System.out.println("cari uang!!");
            }
        }

    }
}