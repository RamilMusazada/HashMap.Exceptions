package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// Kitabxanada olan kitabların adını və onları gətirən oxucuların adını saxlamaq üçün LinkedHashMap istifadə edin.
//	1.	Oxucu adlarını və götürdükləri kitabları əlavə edin.
//	2.	Giriş sırasını saxlayaraq bütün kitabları və onları götürən oxucuları çap edin.
//	3.	Hər hansı bir oxucu yeni bir kitab götürəndə siyahını yeniləyin.
public class Task2 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> loanRecord = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        loanRecord.put("Ramil", "1984");
        loanRecord.put("Mehdi", "Pride and Prejudice");
        loanRecord.put("Elvin", "To kill a Mockingbird");
        System.out.println("Choose an option : ");
        System.out.println("1.Show loan record.");
        System.out.println("2.Add new record");
        System.out.println("3.Exit");
        while (!exit) {
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Records : ");
                    for (Map.Entry<String, String> entry : loanRecord.entrySet()) {
                        System.out.println("Borrower: " + entry.getKey() + " ,  " + "Book: " + entry.getValue());
                    }
                    break;
                case 2:
                    System.out.println("\nAdd new record:");
                    scanner.nextLine();
                    System.out.print("Add borrower's name: ");
                    String borrowerName = scanner.nextLine();

                    System.out.print("Add book's name: ");
                    String bookName = scanner.nextLine();

                    if (borrowerName.isEmpty() || bookName.isEmpty()) {
                        System.out.println("Borrower name or book name can not be empty. Please add.");
                    } else {
                        loanRecord.put(borrowerName, bookName);
                        System.out.println("New record added successfully!");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Finish");
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }
    }
}
