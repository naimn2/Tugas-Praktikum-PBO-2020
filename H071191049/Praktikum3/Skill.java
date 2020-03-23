public class Skill{
    private String type[] = {"Berseker","Shinobi","Necromamancer","Guardian","Angle","Programmer"};
    private String skillSpecial[] = {"Power Attack","Silent Kill","Soul Soldier","Iron Tank","Light Magic","Cheater"};
    private double specialAttack []= {10.0,15.0,15.0,12.0,10.0,50.0};

    //GET SPECIAL SKILL
    public String getSpecialSkill(String typ){
        for(int i=0;i<type.length;i++){
            if(typ.equals(type[i])){
                return skillSpecial[i];
            }
        }
        return null;
    }
    //GET SPECIAL ATTACK
    public double getSpecialAttack(String typ){
        for(int i=0;i<type.length;i++){
            if(typ.equals(type[i])){
                return specialAttack[i];
            }
        }
        System.out.println("> SPECIAL ATTACK TIDAK DITEMUKAN JADI AKAN MENJADI NORMAL ATTACK");
        return 10;
    }
}