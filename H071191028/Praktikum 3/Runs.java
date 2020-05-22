/**
 * runner
 */
import java.util.*;
public class Runs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to The Battle Simulator");
        System.out.println("Insert Player 1");
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Role");
        String role = sc.next();
        Player player1 = new Player(name, role);
        System.out.println();
        System.out.println("Insert Player 2");
        System.out.println("Name");
        String name2 = sc.next();
        System.out.println("Role");
        String role2 = sc.next();
        Player player2 = new Player(name2, role2);

        int p1 = 0;
        int p2 = 0;
        while(true){
            if(player1.dead(player2) || player2.dead(player1)){
                if(player1.dead(player2)){
                    System.out.println(player1.getName() + " DEAD");
                    System.out.println();
                    System.out.println(player2.getName() + " WIN");
                }else{
                    System.out.println(player2.getName() + " DEAD");
                    System.out.println();
                    System.out.println(player1.getName() + " WIN");
                }
            }

            //player1
            System.out.println();
            System.out.println(player1.getName() + "'s turn");
            System.out.println("1. Show status");
            System.out.println("2. Show items");
            System.out.println("3. ATTACK " + player2.getName());
            System.out.println("4. Heal");
            System.out.println("5. Buy items");
            System.out.println("6. Sell items");
            System.out.println("7. QUIT");
            p1 = sc.nextInt();
            if(p1 == 1){
                player1.showStatus();
                
            }else if(p1 == 2){
                player1.showItems();
                
            }else if(p1 == 3){
                player1.attack(player2);
            }else if(p1 == 4){
                player1.healing(player1);
                
            }else if(p1 == 5){
                System.out.println("Buy Hp potion? \n yes(1) no(2)");
                int item = sc.nextInt();
               
                player1.buy(player1, item);
                
            }else if(p1 == 6){
                
                System.out.println("Item ke? ");
                int jual = sc.nextInt();
                player1.sell(jual);
                
            }else if(p1 == 7){
                return;
            }

            //player2
            System.out.println();
            System.out.println(player2.getName() + "'s turn");
            System.out.println("1. Show status");
            System.out.println("2. Show items");
            System.out.println("3. ATTACK " + player1.getName());
            System.out.println("4. Heal");
            System.out.println("5. Buy items");
            System.out.println("6. Sell items");
            System.out.println("7. QUIT");
            System.out.println();
            p2 = sc.nextInt();
            if(p2 == 1){
                player2.showStatus();
               
            }else if(p2 == 2){
                player2.showItems();
                
            }else if(p2 == 3){
                player2.attack(player1);
            }else if(p2 == 4){
                player1.healing(player2);
                
            }else if(p2 == 5){
                
                System.out.println("Buy Hp potion? \n yes(1) no(2)");
                int item2 = sc.nextInt();
                
                player2.buy(player2, item2);
                
            }else if(p2 == 6){
                System.out.println("Item ke? ");
                int jual = sc.nextInt();
                player1.sell(jual);
                
            }else if(p2 == 7){
                return;
            }


        }

    }
}