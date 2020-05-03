class Player{
  private String name;
  private int hp;
  private int attackPower;
  private int defense;

  public Player(String name, int defense, int attackPower){
    this.name = name;
    this.defense = defense;
    this.attackPower = attackPower;
    hp = 100;
  }

  public void getDamage(Player enemy){
    hp = hp + (defense - enemy.getAttackPower());
  }

  public void status(){
    System.out.println(name + "status");
    System.out.println("HP = " + hp);
    System.out.println("Defense = " + defense);
    System.out.println("Attack = " + attackPower);
  }

  public int getAttackPower(){
    return attackPower;
  }
}
