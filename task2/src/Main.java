import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.

        if ((second < first && first < third) || (third < first && first < second)) {
            average = first;
        } else if ((first < second && second < third) || (third < second && second < first)) {
            average = second;
        } else {
            average = third;
        }
        if (second > first && first < third) {
            smallest = first;
        } else if (first > second && second < third) {
            smallest = second;
        } else {
            smallest = third;
        }
        if (second < first && first > third) {
            greatest = first;
        } else if (first < second && second > third) {
            greatest = second;
        } else {
            greatest = third;
        }
        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
