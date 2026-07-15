public class Animal {
    //1. Fields | Properties | Attributes
    protected String name;

    //2. Constructors
    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    //3. Methods
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}