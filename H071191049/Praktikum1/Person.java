public class Person{
    private String name;
    private int age;
    private boolean isMale;

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        String modifName [] = name.split(" ");
        String newName = "";
        for(int i=0;i<modifName.length;i++){
            newName+= modifName[i].substring(0,1).toUpperCase()+modifName[i].substring(1).toLowerCase()+" ";
        }
        this.name = newName;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        if(isMale==true){
            return "Male";
        }
        else{
            return "Famale";
        }
    }
}