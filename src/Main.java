import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        //Uncomment each of task for checking

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

        //5. По введенному номеру определить цвет радуги(1-красный, 4- зеленый ...
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

    public static void fourthTask(){
        System.out.print("Enter a temperature: ");
        StringBuilder str = new StringBuilder("---> ");

        if (scn.hasNextInt()) {
            int result = scn.nextInt();
            if (result > -5) {
                str.append("Warm");
            } else if(result <= -5 && result > -20) {
                str.append("Moderate");
            }else if(result <= -20){
                str.append("Cold");
            }
        } else {
            str.append("Wrong input!");
        }
        System.out.print(str);
    }
}