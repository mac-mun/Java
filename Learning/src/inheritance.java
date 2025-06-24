public class inheritance {
    public static void main(String[] args) {
//        Inheritance = One Class inherits the attributes and methods
//                      from another class
//                      Child <- Parent <- GrandParent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(plant.isAlive);

        cat.eat();
        dog.eat();
        plant.photosynthesize();

        System.out.println(cat.lives);
        System.out.println(dog.lives);

        cat.speak();
        dog.speak();
    }
}
