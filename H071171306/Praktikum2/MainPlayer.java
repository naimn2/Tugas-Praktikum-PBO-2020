public class MainPlayer{
  public static void main(String[] args) {
    int defense = 15;
    int attack1 = 30;
    int attack2 = 35;
    Player player1 = new Player ("Mino ", defense, attack1);
    Player player2 = new Player ("Hilda ", defense, attack2);

    //Lengkapi

    player1.getDamage (player2);
    player2.getDamage (player1);
    player1.status();
    player2.status();
  }
}
