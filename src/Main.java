import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payments = {5000, 8520, 10000, 2350, 12690};
        int sum = 0;
        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        int[] weeklyPayouts = {5000, 10, 10000, 2350, 12690};
        int weeklyPayoutsMax = weeklyPayouts[0];
        int weeklyPayoutsMin = weeklyPayouts[0];
        for (int weeklyPayout : weeklyPayouts) {
            if (weeklyPayout > weeklyPayoutsMax) {
                weeklyPayoutsMax = weeklyPayout;
            } else if (weeklyPayout < weeklyPayoutsMin) {
                weeklyPayoutsMin = weeklyPayout;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + weeklyPayoutsMin + " рублей. Максимальная сумма трат за неделю составила " + weeklyPayoutsMax + " рублей");

        System.out.println("Задача 3");
        int[] averageAmount = Arrays.copyOf(payments, payments.length);
        int monthlyExpenses = 0;
        for (int j : averageAmount) {
            monthlyExpenses += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + monthlyExpenses / averageAmount.length + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.print(Arrays.toString(reverseFullName));
    }
}