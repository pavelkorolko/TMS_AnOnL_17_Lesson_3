import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Написать программу для вывода названия поры года по номеру месяца
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
}