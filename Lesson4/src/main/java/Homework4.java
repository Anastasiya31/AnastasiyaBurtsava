import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        amebaDivision();             //1
        summ(4, 5);            //2
        stars();                     //3
        count();                     //4
        oddArr();                    //7
        index();                     //6
        replace();                   //7
        max(null);
        max(new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2});  //8
        recurrent(null);
        recurrent(new int[]{0, 3, 46, 3, 2, 1, 2});         //9
        recurrent(new int[]{0, 34, 46, 31, 20, 1, 28});     //9
        transposingArr();                                   //10
    }

    // 1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
////   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static void amebaDivision() {
        int ameba = 1;
        for (int i = 3; i <= 24; i += 3) {
            ameba *= 2;
            System.out.println("Через " + i + " будет " + ameba);
        }
    }

    ////        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
////        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    public static void summ(int a, int b) {
        int temp = 0;
        for (int i = 1; i <= b; i++) {
            temp += a;
        }
        System.out.println(temp);
    }

////        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//
////        a)                  b)
////              *        *
////            * *        * *
////          * * *        * * *
////        * * * *        * * * *
////
////        c)                  d)
////        * * * *        * * * *
////          * * *        * * *
////            * *        * *
////              *        *
//

    public static void stars() {
        char[][] chars = new char[4][4];
        System.out.println("b)");
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j <= i; j++) {
                chars[i][j] = '*';
            }
        }
        for (int i = 0; i < chars.length; i++, System.out.println()) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
        }
        System.out.println("c)");
        for (int i = chars.length - 1; i >= 0; i--, System.out.println()) {
            for (int j = chars[i].length - 1; j >= 0; j--) {
                System.out.print(chars[i][j] + " ");
            }
        }
    }

    ////        4)В переменную записываем число.
////        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.

    public static void count() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = sc.nextInt();
        int num = Math.abs(number);
        int count = (num == 0) ? 1 : 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр = " + count);
        } else if (number < 0) {
            System.out.println(number + " - это отрицательное число, количество цифр = " + count);
        } else {
            System.out.println(number + " - это ноль, количество цифр = " + count);
        }
    }

////        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
////        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
//

    private static void oddArr() {
        int a = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                a++;
        }
        int[] arr = new int[a];
        for (int i = 1, b = 0; i < 100; i += 2) {
            arr[b] = i;
            System.out.print(arr[b] + " ");
            b++;
        }
        System.out.println(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    ////        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
////        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

    private static void index() {
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(mass));
        int max = 0;
        for (int j : mass) {
            if (max < j) {
                max = j;
            }
        }
        int tmp = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == max)
                tmp = i;
        }
        System.out.println("Максимальный элемент " + max + ", индекс его последнего вхождения в массив = " + tmp);
    }

    ////        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
////        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
////        Снова выведете массив на экран на отдельной строке.

    private static void replace() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    ////        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
//
    private static void max(int[] arr) {
        if (arr == null) {
            System.out.println("Пустой массив");
        } else {
            int max = 0;
            for (int i = 0; i < Objects.requireNonNull(arr).length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    int temp = max;
                    max = arr[0];
                    arr[0] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    ////        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся

    private static void recurrent(int[] arr) {
        if (arr == null) {
            System.out.println("Пустой массив");
        } else {
            boolean dupicates = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        dupicates = true;
                    }
                }
            }
            if (dupicates) {
                System.out.println(" - повторяющиеся элементы массива");
            } else {
                System.out.println("Массив не имеет повторяющихся элементов");
            }
        }
    }

////        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
////        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
////        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)

    public static void transposingArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
            }
        }
        System.out.println("Исходная матрица");
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("Транспонированная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
