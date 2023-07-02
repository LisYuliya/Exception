import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExample {
    public static void method1() {
        try {
            int[] arr = new int[5];
            int value = arr[10];  // Выход за границы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public static void method2() {
        try {
            String str = null;
            int length = str.length();  // Вызов метода на объекте со значением null
        } catch (NullPointerException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public static void method3() throws FileNotFoundException {
        try {
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);  // Попытка открыть несуществующий файл
        } catch (NoSuchElementException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        method1();
        method2();
        try {
            method3();
        } catch (FileNotFoundException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
