package Person1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ean Craig", 11);
        Person p2 = new Person("Evan Ross", 12);


        p1.greet();
        p2.greet();


        p1.setAge(14);
        p2.setName("Lewis Jordan"); 
        p1.greet();
        p2.greet();
    }
}
