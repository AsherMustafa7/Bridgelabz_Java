package javaStatics.level1;

public class Test {
    final int a;
    Test() {
        a = 10; // Assigning value to final variable in constructor
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Value of a: " + test.a);
        // test.a = 20; // This line will cause a compilation error because 'a' is final and cannot be reassigned
    }
    
}
