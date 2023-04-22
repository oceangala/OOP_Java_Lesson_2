package HomeWork2;
/*
Чтобы можно было хранить еду, создадим класс Тарелка с полем food
(еда измеряется в целых числах и не важно, что это за единицы измерения).
При создании тарелки мы можем указать начальное значение food.
В процессе работы с помощью метода info() можно вывести в консоль
информацию о тарелке.
*/
public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void FillThePlate(int addFood){
        if (addFood>=0){
            this.food+=addFood;
        }
    }
}