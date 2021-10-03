public class Homework2 {

    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{-2, -3, -1, -5}));
        System.out.println(calculateHypotenuse(3, 4));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        long c = (long) a + (long) b;
        if (c >= Integer.MAX_VALUE) return -1;
        else {
            return a + b;
        }
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     */
    public static double average(int[] array) {
        double sum = 0.0;
        for (int i : array) sum += i;
        return sum / array.length;
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     */
    public static double calculateHypotenuse(int a, int b) {
        int c = a * a + b * b;
        return Math.sqrt(c);
    }
}


