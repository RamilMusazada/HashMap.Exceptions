package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//İstifadəçidən tam ədəd daxil etməsini istəyin.
//InputMismatchException: Daxil olunan məlumat rəqəm deyilsə tutun.
//ArithmeticException: İki rəqəmi bölərkən sıfıra bölünmə halını tutun.
//Müvafiq mesajları ekrana çıxarın.
public class Task4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number : ");
            int a = scanner.nextInt();
            System.out.println("Enter second number : ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result is "+ result);
        } catch (InputMismatchException a) {
            System.out.println("Error invalid input.");
        }catch (ArithmeticException b){
            System.out.println("Error. Division by 0 isn't allowed");
        }
    }
}
