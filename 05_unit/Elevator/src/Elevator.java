/*
Создайте класс Elevator, эмулирующий работу пассажирского лифта. В классе создайте:
Переменные currentFloor (текущий этаж), minFloor и maxFloor (минимальный и максимальный этажи).
Тип переменных — int.
Конструктор с двумя параметрами minFloor и maxFloor, сохраняющий эти параметры
в соответствующих переменных класса.
Значение переменной currentFloor изначально должно быть равно 1.
Метод getCurrentFloor, возвращающий текущий этаж, на котором находится лифт.
Метод moveDown, перемещающий лифт на один этаж вниз (уменьшающий значение переменной
 currentFloor на единицу).
Метод moveUp, перемещающий лифт на один этаж вверх.
Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если
он задан верно. Если параметр у метода задан неверно, ничего не делать и выводить
в консоль сообщение об ошибке. Этот метод может перемещать лифт только последовательно,
по одному этажу, с помощью циклов и методов moveUp и moveDown, и должен выводить в консоль текущий
этаж после каждого перемещения между этажами.
 */
public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;


    public int getCurrentFloor() {
        return currentFloor;
    }

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void move(int floor){
        while (floor != currentFloor) {
            if (floor >= minFloor && floor < currentFloor) {
                moveDown();
            } else if (floor <= maxFloor && floor > currentFloor) {
                moveUp();
            } else {
                System.out.println("Wrong number floor");
                break;
            }
        }
    }
}
