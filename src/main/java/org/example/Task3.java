package org.example;

import java.util.Scanner;

//İki rəqəmi bölən bir proqram yazın.İstifadəçidən iki tam ədəd daxil etməsini istəyin.
//İkinci rəqəm sıfır olduqda ArithmeticException-ı tutmaq üçün try-catch istifadə edin.
//İstisna baş verdikdə uyğun mesaj çap edin.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number : ");
            double a = scanner.nextDouble();
            System.out.println("Enter second number : ");
            double b = scanner.nextDouble();
            double result = a / b;
            System.out.println("Result is " + result );
        }

        catch (ArithmeticException a){
            System.out.println("Error. Division by 0 isn't allowed");
        }
        catch (Exception b ){
            System.out.println("Error . Invalid input");
        }
    }
}
