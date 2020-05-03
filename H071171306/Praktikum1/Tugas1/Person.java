public class Person{
  String name;
  int age;
  boolean isMale;

  void setAge(int age){
    this.age = age;
  }
  int getAge(){
    return age;
  }

  void setName(String name){
    this.name = name;
  }
  String getName(){
    return name;
  }

  String getGender(){
    return (this.isMale)? "Male" : "Female";
    }

}
