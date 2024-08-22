/* Encapsulation is the technique of making the fields in a class private
 and providing access to the fields via public methods.
 */
 
 public class Student {
    private String name;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}