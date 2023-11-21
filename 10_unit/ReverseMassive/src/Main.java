import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] letters = {"a", "b", "c", "d"};
        ReverseArray array = new ReverseArray();
        array.reverse(letters);
    }

}
//реализуйте метод reverse(), который должен помен€ть пор€док элементов
// на обратный и вернуть тот же самый массив.
//ѕроверьте ваш код с помощью тестов.
//ѕример
//
//ѕервоначальный массив: [УaФ, УbФ, УcФ, УdФ].
//ћассив с элементами в обратном пор€дке: [УdФ, УcФ, УbФ, УaФ].