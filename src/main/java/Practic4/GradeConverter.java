package Practic4;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println("Оценка: А");
        } else if (score >= 80 && score <= 89){
            System.out.println("Оценка: B");
        } else if (score >= 70 && score <= 79){
            System.out.println("Оценка: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Оценка: D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Оценка: F");
        } else {
            System.out.println("Ошибка: введите число от 0 до 100.");
        }
        scanner.close();

    }
}
