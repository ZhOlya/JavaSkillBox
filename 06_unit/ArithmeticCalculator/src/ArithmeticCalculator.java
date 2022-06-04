public class ArithmeticCalculator {
    public int x;
    public int y;

    public ArithmeticCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculate (Operation operation){
        switch (operation){
            case ADD -> System.out.println("Sum: " + (x + y));
            case SUBTRACT -> System.out.println("Difference: " + (x - y));
            case MULTIPLY -> System.out.println("Product: " + (x * y));
        }

    }
}
/*
—оздайте класс ArithmeticCalculator, который будет выполн€ть арифметические операции над числами.

–еализуйте конструктор с двум€ параметрами-числами, который сохран€ет переданные числа в свойствах класса.

–еализуйте метод calculate, на вход которого передаЄтс€ одна из арифметических операций (объект
 класса Operation Ч смотрите следующий пункт задани€), которую нужно произвести с двум€ числами,
  переданными в конструктор при создании объекта.

—оздайте Enum Operation с трем€ значени€ми: ADD, SUBTRACT, MULTIPLY. Ёти значени€ будут
соответствовать арифметическим операци€м Ч сложению, вычитанию и умножению.
 */
