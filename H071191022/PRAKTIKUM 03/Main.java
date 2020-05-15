import java.util.ArrayList;

class Player{
    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private ArrayList<Item> item;

    public Player(String name,String role,int money){
        this.name = name; 
        this.role = role;
        this.money = money;

        hp = 100;
        level = 1;
        damage = 10;
        money = 100000;
        energy = 100;
        item = new ArrayList<>();
    }

    public void setDamage(double damage){
        this.damage = damage;
    }

    public void setEnergy(double energy){
        this.energy = energy;
    }
    public double getEnergy() {
        return this.energy;
    }

    public void setMoney(int money){
        this.money = money;
    }
    public int getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public int getLevel() {
        return this.level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
    public double getHp() {
        return this.hp;
    }

    public void showStatus(){
        System.out.println("Name : " + name);
        System.out.println("Role : " + role);
        System.out.println("Level : " + level);
        System.out.println("Damage : "+ damage);
        System.out.println("HP : " + hp);
        System.out.println("Energy : " + energy);
        System.out.println("Money : " + money);
        System.out.println();
    }

    public void showItems(){
        System.out.println(name + "'s Item : ");
        for (Item i : item){
            System.out.println(i.getName());
        }
    }

    public void attack(Player player){
        if (player.hp <= 0 && player.energy <= 0){
            System.out.println("---");
        }else{
            player.hp = player.hp = damage;
            energy -= 20;
        }
    }

    public void getDamage(Player player){
        System.out.println(name + " has been damaged " + damage + " by " + player.name);
    }

    public void healing (double health){
        hp += health;
        if (hp > 100) hp = 100;
        System.out.println(name + " was healed " + health + " %\n");
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }
    public ArrayList<Item> getItem() {
        return this.item;
    }

    public void buy(Item item){
        if (money >= item.getPrice()) {
            money -= item.getPrice();
            this.item.add(item);
            System.out.println("***" + item.getName().toUpperCase() + " purchased***");
        } else {
            System.out.println("!!!Can't afford " + item.getName().toUpperCase()+ "!!!");
        }
    }

    public void sell(Item item){
        money += item.getPrice();
        this.item.remove(item);
        System.out.println("\n" + item.getName() + " was sold " + item.getPrice());
    }

    public void destroy(Item item){
        item.remove(item);
        System.out.println("\n" + item.getName() + " has been destroyed ");
        
    }

    public void use(Item item){
        if (!this.item.contains(item)){   
            System.out.println("you dont have this item");
            return;
        }
        else {
            if (item.getName().equals("Item A") && money >= item.getPrice()){
                energy += 50;
                item.add(item);
            }else if (item.getName().equals("Item B") && money>= item.getPrice()){
                hp += 50;
                item.add(item);
            }else if (item.getName().equals("Item C") && money>= item.getPrice()){
                item.add(item);
            }
        }
    }

    boolean dead(Player enemy){
        if (enemy.hp <= 0){
            enemy.hp = 0;
            System.out.println(enemy.name + " dead ");
            return true;
        }
        return false;
    }
}

class Item{

    private String name;
    private int price;
    private String info;

    public Item (String name,int price,String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public void add(Item item) {
    }

    public void remove(Item item) {
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getInfo() {
        return this.info;
    }
}

class Main {

    public static void main(String[] args) {
        Player p1 = new Player("Ruby","Fighter", 30000);
        Player p2 = new Player("Bruno", "Marksman", 15000);

        Item item1 = new Item("Item A",1000,"Attack Items");
        Item item2 = new Item("Item B",2000,"Movement Items");
        Item item3 = new Item("Item C",3000,"Defense Items");
        Item item4 = new Item("Item D",4000,"Defense Items");
        Item item5 = new Item("Item E",5000,"Defense Items");

        ArrayList<Item> listItem = new ArrayList<>();
        
        p1.attack(p2);
        
        if(p1.dead(p2)) {
            p2.showStatus();
                // break;
        }
        p1.getDamage(p2);
        p1.healing(2000000);
        p1.buy(item1);
        p1.use(item1);
        p1.sell(item4);
        p1.showStatus();
        p1.showItems();
        System.out.println("===========================================");

        p2.attack(p1);

        if(p2.dead(p1)) {
            System.out.println("p2 mati");
            p1.showStatus();
        }

        p2.getDamage(p1);
        p2.healing(5);
        p2.buy(item2);
        p2.buy(item3);
        
        p2.use(item2);
        p2.use(item3);
         
        p2.destroy(item5);
        p2.showStatus();
        p2.showItems();
    }
}   