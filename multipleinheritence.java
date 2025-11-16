public class multipleinheritence {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.play();
        d.bark();
    }
}
interface Animal{
    void eat();

}
interface Pet {
    void play();
}
class Dog implements Animal,Pet{
    public void eat(){
        System.out.println("Dog can eat");
    }
    public void play(){
        System.out.println("Dog loves to play");
    }
    public void bark(){
        System.out.println("Dog can bark");
    }
}
