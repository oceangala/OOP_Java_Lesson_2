package HomeWork2;
/*
Допустим, в программе есть класс Кот.
У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(),
который заставляет кота покушать, но пока что он пустой, так как неизвестно,
откуда кот должен брать еду:
*/
public class Cat {
    private String name;
    private int appetite;

    private boolean hunger;

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean getHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }
    public boolean eat(int appetite, int food) {
        if (food>=appetite) return true;
                else return false;
    }
    public int whatLeftOnThePlate(int appetite, int food){
        food -= appetite;
        return food;
    }


    }

