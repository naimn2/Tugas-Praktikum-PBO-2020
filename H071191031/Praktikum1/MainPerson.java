class MainPerson{
    public static void main(String[] args) {
        Person person1 = new Person();

        int age = 23;
        String name = "ridho";
        boolean isMale = true;
        person1.setAge(age);
        person1.setName(name);
        person1.setGender(isMale);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getGender());


    }
}