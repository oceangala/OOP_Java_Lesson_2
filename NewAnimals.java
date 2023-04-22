public class NewAnimals{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Whiskers", "white");
        cat1.jump();
        cat1.voice();
        System.out.println(((Cat)cat1).getName()+"'s color is "+ cat1.getColor());
        Dog dog1 = new Dog("Marley", 9);
        dog1.jump();
        dog1.voice();


        Animal cat2 = new Cat("Peachy", "red");
        cat2.jump();
        cat2.voice();
        System.out.println(((Cat)cat2).getName()+"'s color is "+ ((Cat)cat2).getColor());
        if (cat2 instanceof Dog){
            System.out.println("Puppy's weight is "+ ((Dog)cat2).getWeight());
        }

        voiceAllAnimals(new Animal[] {cat2, cat1, dog1});

        CatV2 catV2 = new CatV2("Kiki");
        Runnable catV2_2 = new CatV2("Jiji");
        DogV2 dogV2 = new DogV2("Ron");
        Duck duck = new Duck("Gaga");

        Object[] animals2 = new Object[] { catV2, catV2_2, dogV2, duck };
        for (Object animal: animals2){
            if (animal instanceof Flyable){
                ((Flyable)animal).fly(50);
            }
        }


    }
    public static void voiceAllAnimals(Animal[] animals ){
        for (Animal animal: animals) {
            animal.voice();
            if (animal instanceof Dog){
                System.out.println("it's "+ animal.getName()+
                        ". Puppy's weight is "+ ((Dog)animal).getWeight()+".");
            }
        }
    }


}

interface Runnable{

    String getName();
    void run (int distance);
    void swim (int distance);
}

interface Flyable{
    void fly (int distance);
}


class CatV2 implements Runnable {
    private String name;

    public CatV2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s had run %d meters.\n", name, distance);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s had swum %d meters.\n", name, distance);
    }
}

class DogV2 implements Runnable {
    private String name;

    public DogV2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {System.out.printf("%s had run %d meters.\n", name, distance);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s had swum %d meters.\n", name, distance);
    }
}

class Duck implements Runnable, Flyable{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s had run %d meters.\n", name, distance);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s had swum %d meters.\n", name, distance); }

    @Override
    public void fly(int distance) {
        System.out.printf("%s had flew %d meters.\n", name, distance);  }
}




abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void jump(){
        System.out.println(name+" hop jumps");
    }
    public abstract void voice();
}

class Dog extends Animal{

    public int getWeight() {
        return weight;
    }

    private int weight;
    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println(getName()+" barks");
    }

    @Override
    public void jump() {
        super.jump();
    }
}


class Cat extends Animal{

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    private String color;

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println(getName()+" meows");
    }

    @Override
    public void jump() {
        super.jump();
    }
}