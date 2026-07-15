public class Dog extends Animal {

    //2. Constructors
    public Dog(String name) {
        super(name);
    }

    //Main
    public static void main(String[] args) {
        //1. Khởi tạo đối tượng Dog
        Dog d = new Dog("Buddy");

        //2. Gọi phương thức makeSound() kế thừa từ Animal
        d.makeSound();
    }
}