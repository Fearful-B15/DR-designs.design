/**
 * A constructor in Java is a special method that is used to initialize objects.
 */
 
 public class Student {
    String name;
 
    // Constructor
    Student(String name) {
        this.name = name;
    }
 
    // Method
    public void study() {
        System.out.println(name + " is studying.");
    }
}
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
/*
Polymorphism is the ability of an object to take on many forms.
*/
public class Animal {
    public void sound(){
        System.out.println("Animal is making a sound");  
    }
}
 
public class Horse extends Animal {
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
}
 
public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
 