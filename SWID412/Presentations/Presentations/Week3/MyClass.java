//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Classes in JAVA programming  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

/*
Outcomes:
    Understand what classes are in Java.
    Learn how to declare and initialize classes.
    Identify different types of classes in Java.
*/


public //The public keyword is used to make classes, methods, and variables accessible from any other class. It is the most permissive access level.

//Classes: When a class is declared as public, it can be accessed from any other class in any package.
public class MyClass {
    // Class content
}

//Methods: A public method can be called from any other class.
public class MyClass {
    public void myMethod() {
        System.out.println("This is a public method.");
    }
}

//Variables: A public variable can be accessed directly from any other class.
public class MyClass {
    public int myVariable = 10;
}

/*
=========================================================== Key Points when using the public keyword ========================================
Visibility: 
Public members are accessible from any other class, regardless of the package.

Use Cases: 
Use the public modifier when you want to expose the functionality or data to other parts of your application or to other applications.

Security: 
Be cautious when using public for sensitive data or critical methods, as it can lead to security vulnerabilities if not managed properly.
*/

/*
The public keyword is essential for defining the accessibility of your code components and ensuring that they can be used as intended 
across different parts of your application!
/*







//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Types of Classes in JAVA programming  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


---------------------------------------------------------------------------Regular Class: 
 A regular class is the most common type of class in Java. 
 It serves as a blueprint for creating objects and can contain fields (attributes), 
    methods (functions), constructors, and inner classes.
 */
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Car starts");// System.out... => outputs to the console
    }

    public void stop() {
        System.out.println("Car stops");
    }
}



/*
---------------------------------------------------------------------------Final Class: 
A final class cannot be subclassed. 
This is useful when you want to prevent inheritance and ensure that the class’s behavior remains unchanged.
 */
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}


/*
--------------------------------------------------------------------------Static Class: 
A class that contains only static members.
In Java, the concept of a static class is not directly supported. 
However, you can have static nested classes. 
A static nested class is associated with its outer class and can access static members of the outer class.
*/
class StaticClass {
    static int staticVar = 10;
    static void display() {
        System.out.println("Static variable: " + staticVar);
    }
}


/*
--------------------------------------------------------------------------Abstract Class: 
A class that cannot be instantiated and may contain abstract methods.
 An abstract class cannot be instantiated and is meant to be subclassed. 
 It can contain abstract methods (without implementation) and concrete methods (with implementation). 
 Abstract classes are used to define common characteristics for subclasses.
*/
abstract class Animal {
    abstract void makeSound();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}


/*
--------------------------------------------------------------------------Concrete Class: 
A regular class that can be instantiated.
*/
class ConcreteClass {
    void display() {
        System.out.println("This is a concrete class.");
    }
}

/*
--------------------------------------------------------------------------POJO Class: 
A POJO class is a simple Java class that follows certain conventions, 
such as having private fields, public getter and setter methods, and a no-argument constructor. 
POJOs are used to represent data.
*/
public class POJOClass {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/*
--------------------------------------------------------------------------Singleton Class: 
A singleton class ensures that only one instance of the class is created. 
This is useful for managing shared resources or configurations.
*/
public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

/*
--------------------------------------------------------------------------Inner Class: 
An inner class is defined within another class. 
It can access the members of the outer class, including private members. 
Inner classes are used to logically group classes that are only used in one place.
*/
public class OuterClass {
    private String outerField = "Outer field";

    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }
}


/*
--------------------------------------------------------------------------Anonymous Class 
An anonymous class is a type of inner class without a name. 
It is used to instantiate objects with certain “extras,” such as method implementations, 
without having to create a separate class.
*/
public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal() {
            void makeSound() {
                System.out.println("Roar");
            }
        };
        myAnimal.makeSound();
    }
}
