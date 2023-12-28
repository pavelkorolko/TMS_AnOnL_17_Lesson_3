import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        //Uncomment each of task for checking

        //Switch/if else
        //1. Написать программу для вывода названия поры года по номеру месяца
        //firstTask();

        //2. Написать программу для вывода названия поры года по номеру месяца
        //secondTask();

        //3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение
        //четное число или нет.
        //thirdTask();

        //4. Для введеного числа вывести：
        //t > -5 ---> warm
        //-5 >= t > -20 ---> moderate
        //-20 >= t ---> cold
        //fourthTask();

        //5. По введенному номеру определить цвет радуги(1-красный, 4- зеленый ...)
        //fifthTask();

        //Loops
        //1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        //При решении используйте операцию ++.
        //System.out.println(sixthTask(Optional.empty(), Optional.empty()));

        //2. Необходимо вывести на экран числа от 5 до 1.
        //При решении используйте операцию --.
        //System.out.println(seventhTask(Optional.empty(), Optional.empty()));

        //3. Напишите программу, где вводится любое целое позитивное число. Программа суммирует числа от 1 до введенного.
        //System.out.println("Sum: " + eighthTask());

        //4. Необходимо, чтобы программа выводила последовательность:
        //7 14 21 28...98
        //System.out.printf(ninthTask());

        //5. Вывести 10 первых чисел последовательности 0, -5, -10, -15...
        System.out.println(tenthTask());

    }

    private static String tenthTask() {
        StringBuilder str = new StringBuilder();
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            str.append(temp + " ");
            temp -= 5;
        }

        return str.toString();
    }

    private static String ninthTask() {
        StringBuilder str = new StringBuilder();
        int endNum = 0;
        while(endNum < 98){
            endNum += 7;
            str.append(endNum + " ");
        }
        return str.toString();
    }

    private static int eighthTask() {
        try {
            System.out.print("Enter a positive num: ");
            if (scn.hasNextInt()) {
                int result = scn.nextInt();
                if (result > 0) {
                    int sum = 0;
                    for (int i = 1; i <= result; i++) {
                        sum += i;
                    }
                    return sum;
                } else {
                    throw new Exception("Not a positive number!");
                }
            } else {
                throw new Exception("Not a number!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 1;
    }

    private static String seventhTask(Optional<Integer> start, Optional<Integer> end) {
        int e = end.orElse(5);
        int s = start.orElse(1);
        StringBuilder str = new StringBuilder();

        for (int i = e; i >= s; i--) {
            str.append(i + " ");
        }

        return str.toString();
    }

    private static String sixthTask(Optional<Integer> start, Optional<Integer> end) {
        int s = start.orElse(1);
        int e = end.orElse(99);
        StringBuilder str = new StringBuilder();

        for (int i = s; i <= e; i++) {
            if (i % 2 != 0) {
                str.append(i + " ");
            }
        }

        return str.toString();
    }

    public static void firstTask() {
        System.out.print("Enter the month by a number: ");
        StringBuilder str = new StringBuilder("---> ");

        if (scn.hasNextInt()) {
            switch (scn.nextInt()) {
                case 3, 4, 5:
                    str.append("Spring");
                    break;
                case 6, 7, 8:
                    str.append("Summer");
                    break;
                case 10, 11, 9:
                    str.append("Autumn");
                    break;
                case 12, 1, 2:
                    str.append("Winter");
                    break;
                default:
                    str.append("Input is out of range: 1-12");
                    break;
            }
        } else {
            str.append("Wrong input!");
        }
        System.out.print(str);
    }

    public static void secondTask() {
        System.out.print("Enter the month by a number: ");
        StringBuilder str = new StringBuilder("---> ");

        if (scn.hasNextInt()) {
            int result = scn.nextInt();

            if (result >= 1 && result < 3 || result == 12) {
                str.append("Winter");
            } else if (result >= 3 && result < 6) {
                str.append("Spring");
            } else if (result >= 6 && result < 9) {
                str.append("Summer");
            } else if (result >= 9 && result < 12) {
                str.append("Autumn");
            } else {
                str.append("Input is out of range: 1-12");
            }
        } else {
            str.append("Wrong input!");
        }
        System.out.print(str);
    }

    public static void thirdTask() {
        System.out.print("Enter a number: ");
        StringBuilder str = new StringBuilder("---> ");

        if (scn.hasNextInt()) {
            int result = scn.nextInt();
            if (result % 2 == 0) {
                str.append("Even number!");
            } else {
                str.append("Odd number!");
            }
        } else {
            str.append("Wrong input!");
        }
        System.out.print(str);
    }

    public static void fourthTask() {
        System.out.print("Enter a temperature: ");
        StringBuilder str = new StringBuilder("---> ");

        if (scn.hasNextInt()) {
            int result = scn.nextInt();
            if (result > -5) {
                str.append("Warm");
            } else if (result <= -5 && result > -20) {
                str.append("Moderate");
            } else if (result <= -20) {
                str.append("Cold");
            }
        } else {
            str.append("Wrong input!");
        }
        System.out.print(str);
    }

    public static void fifthTask() {
        System.out.print("Enter a num for rainbow color determination: ");
        StringBuilder str = new StringBuilder("---> ");

        if (scn.hasNextInt()) {
            int result = scn.nextInt() - 1;
            if (result <= RainBowColor.values().length) {
                RainBowColor color = RainBowColor.values()[result];

                switch (color) {
                    case red -> str.append("red");
                    case green -> str.append("green");
                    case yellow -> str.append("yellow");
                    case orange -> str.append("orange");
                    case blue -> str.append("blue");
                    case indigo -> str.append("indigo");
                    case violet -> str.append("violet");
                }
            } else {
                str.append("There is no a such color");
            }
        } else {
            str.append("Wrong input!");
        }
        System.out.print(str);
    }
}