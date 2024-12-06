package org.example;

import java.util.Scanner;

//Bir yaş yoxlama proqramı yazın:
//İstifadəçidən yaş daxil etməsini istəyin.
//Əgər yaş mənfi və ya çox böyükdürsə, IllegalArgumentException atmaq üçün throw istifadə edin.
//Metod throws ilə istisnanı elan etsin.
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter age : ");
            int age = scanner.nextInt();
            check(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void check(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        } else if (age > 150) {
            throw new IllegalArgumentException("Age is too large ");
        }
    }
}
