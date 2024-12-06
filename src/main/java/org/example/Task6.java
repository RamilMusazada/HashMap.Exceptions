package org.example;
//Bir xüsusi istisna yaradın:
//CustomException adlı istisna sinfi yaradın.Əgər istifadəçi yaşı 18-dən azdırsa,
//xüsusi istisna atılsın
import java.security.spec.ECFieldF2m;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter your age : ");
            int age = scanner.nextInt();
            check(age);
        }catch (CustomException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
    public static void check(int age) throws CustomException{
        if(age<18){
            throw new CustomException("Age is below 18 .");
        }

    }
}
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}