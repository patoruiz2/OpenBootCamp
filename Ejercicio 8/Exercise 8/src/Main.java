public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        //SETTERS
        person.setAge(24);
        person.setName("Patricio");
        person.setPhone("15892999");
        //GETTER
        int age = person.getAge();
        String name = person.getName();
        String phone = person.getPhone();

        System.out.println(
            "My name is "+ name
            + " I'm " + age
            + " years old and my phone is " + phone);
    }
}

class Person {
    private int age;
    private String name;
    private String phone;

    //SETTERS
    public void setAge(int age){
        this.age = age;
    };
    public void setName(String name){
        this.name = name;
    };
    public void setPhone(String phone){
        this.phone = phone;
    };

    //GETTERS
    public int getAge(){
        return this.age;
    };
    public String getName(){
        return this.name;
    };
    public String getPhone(){
        return this.phone;
    };
}