package JavaInheritance2;


class Arithmetic {
    // Public method so it can be inherited and accessed
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // No need to override anything, inherits 'add' as-is
}

public class Solution {
    public static void main(String []args){
        Adder a = new Adder();
        
        // Print superclass name
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getSimpleName());
        
        // Print result of add method
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10));
    }
}

