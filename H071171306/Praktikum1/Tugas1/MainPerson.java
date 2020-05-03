class MainPerson{
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(20);
    p1.setName("Alexa");
    p1.isMale = false;
    System.out.println(p1.getAge());
    System.out.println(p1.getName());
    System.out.println(p1.getGender());
  }
}
