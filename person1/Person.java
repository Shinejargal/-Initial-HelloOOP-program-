package Person1;

public class Person {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }


    public String getName() { return name; }
    public int    getAge()  { return age; }
    public void   setName(String name) { this.name = name; }
    public void   setAge(int age)      { this.age  = age; }


    public void greet() {
        System.out.println("Hi, I'm " + name +
                           " and I'm " + age + " years old.");
    }
}
