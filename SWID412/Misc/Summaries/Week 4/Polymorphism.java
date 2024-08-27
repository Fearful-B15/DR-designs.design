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
 