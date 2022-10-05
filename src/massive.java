import java.util.Arrays;

public class massive {
    public static void main(String[] args) {
        int[] array = new int[11]; // сейчас array содержит одни нули
        int value = 5; // первое значение для массива array
        for (int i = 0; i < array.length; i++) { // обходим весь массив, начиная с 0-го индекса, выполняя действия:
            array[i] = value; // - присваиваем ячейке значения value
            value++; // - увеличиваем value на 1 каждый раз (5, 6, 7, ..., 15)
        }
        for (int i = 0; i < array.length; i++) { // обходим весь массив, начиная с 0-го индекса, с исполнением println
            System.out.println(array[i]); //печатаем элемент массива
        }
    }
}