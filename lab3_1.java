import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int n = scanner.nextInt();                  //задаем размерность массива 1
        float[] arr1 = new float[n];

        System.out.print("Введите массив: ");       //задаем массив через цикл for
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextFloat();
        }

        float[] arr2 = new float[n];
        float s = 0;
        for (int i = 0; i < n; i++) { //создаем сумму, пробегаемся по массиву 1, к сумме прибавляем текущий элемент
            s += arr1[i];             //каждый элемент массива 2 приравниваем к среднему арифметическому
            arr2[i] = s / (i + 1);    //предыдущих элементов+текущий элемент
        }

        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr1.length; i++) { //Выводим массив 1
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.print("Массив после обработки: ");
        for (int i = 0; i < arr2.length; i++) { //Выводим массив 2
            System.out.print(arr2[i] + " ");
        }
    }
}
