import java.util.Arrays;

public class ArrayOperations {
    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        // Проверка на равенство длин массивов
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы должны быть одинаковой длины");
        }

        // Создаем новый массив для хранения разностей элементов
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            // Вычисляем разность элементов в соответствующих ячейках
            result[i] = arr1[i] - arr2[i];
        }

        // Возвращаем новый массив с разностями элементов
        return result;
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        // Проверка на равенство длин массивов
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы должны быть одинаковой длины");
        }

        // Создаем новый массив для хранения частных элементов
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            // Проверка деления на ноль
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            }
            // Вычисляем частное элементов в соответствующих ячейках
            result[i] = arr1[i] / arr2[i];
        }

        // Возвращаем новый массив с частными элементами
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 0 };


        try {
            int[] subtractResult = subtractArrays(arr1, arr2);
            System.out.println("Результат вычитания: " + Arrays.toString(subtractResult));
        } catch (RuntimeException e) {
            System.out.println("Исключение: " + e.getMessage());
        }

        try {
            int[] divideResult = divideArrays(arr1, arr2);
            System.out.println("Результат деления: " + Arrays.toString(divideResult));
        } catch (RuntimeException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
