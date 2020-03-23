class Person{
    String name;
    int age;
    boolean isMale;

    void setName(String name) {
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        String male = "Laki-laki";
        String female = "Perempuan";

        if (isMale){
            return male;
        }else {
            return female;
        }
    }
}