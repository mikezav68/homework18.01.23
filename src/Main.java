public class Main {
    public static void main(String[] args) {
        tasks();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void tasks () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Сумма трат за месяц составила " + arr[i] + " рублей");
        }
        System.out.println("Задача 2");
        int maximum = 0;
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат составила " + maximum + " рублей");
        System.out.println("Минимальная сумма трат составила " + minimum + " рублей");
        System.out.println("Задача 3");
        int sum = 0;
        double average = 0;
        for (int i : arr) {
            sum += i;
        }
        average = sum / arr.length;
        System.out.println("Средняя сумма трат составила " + average + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--)
        {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");

    }
    public static void task6 () {
        System.out.println("Задача 6");

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
    public static void task8 () {
        System.out.println("Задача 8");

    }
}