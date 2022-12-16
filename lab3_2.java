import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Размерность массива: ");
            int[] arr1 = new int[scanner.nextInt()]; //Вводим размерность массива 1

            System.out.print("Число к удалению: ");
            int elim_num = scanner.nextInt(); //Вводим число к удалению

            int count_num = 0;
            System.out.print("Введите массив: "); //Заполняем массив 1 и одновременно считаем количество чисел на удаление
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = scanner.nextInt();
                if (arr1[i] == elim_num) {
                    count_num++;
                }
            }

            int j = 0;
            int[] arr2 = new int[arr1.length - count_num]; //Создаем массив 2 нужной длины
            for (int i = 0; i < arr1.length; i++) {       //Проходимся по массиву 1 и закидываем нужные значения в 2
                if (arr1[i] != elim_num) {
                    arr2[j] = arr1[i];
                    j++;

                }
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
        } catch (Exception a) {
            System.out.print("Ошибка, массив и число к удалению должны быть целыми");
        }
    }
}
