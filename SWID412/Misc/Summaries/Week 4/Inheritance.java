/**
 * Inheritance is a mechanism in which one class acquires the property of another class.
 */
 
 public class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}
 
public class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}
 