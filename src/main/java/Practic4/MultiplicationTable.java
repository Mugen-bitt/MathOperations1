package Practic4;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i ++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();




    }
}


