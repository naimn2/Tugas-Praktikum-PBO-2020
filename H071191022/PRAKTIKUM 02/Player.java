class Player {

    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    //CONSTRUCTOR
    public Player (String name,int defense){
        this.name = name;
        this.defense = defense;
        hp = 100;
    }
    public Player (String name,int attack,int defense){
        this.name = name;
        attackPower = attack;
        this.defense = defense;
        hp = 100;
    }
    //SET
    public void setAttack (int attackPower){
        this.attackPower = attackPower;
    }
    //GET
    public void getDamage (Player enemy){
        hp = hp + (defense - enemy.getAttackPower());
    }
    public int getAttackPower(){
        return attackPower;
    }

    public void status (){
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
    }    
}