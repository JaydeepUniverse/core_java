package inheritance;

public class MainMethodForAnimal {
  public static void main(String[] args){
    Animal a = new Animal();
    a.eat();
    DogChild d = new DogChild();
    d.eat();
    d.bark();
    BabyDog b = new BabyDog();
    b.eat();
    b.bark();
    b.play();
    Cat c = new Cat();
    c.eat();
    c.meuu();
  }
}
