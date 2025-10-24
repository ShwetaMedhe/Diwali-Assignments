package com.demo.test;

import java.util.Scanner;
import com.demo.service.ArrayService;

public class TestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        ArrayService.acceptData(arr);

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Rotate Array Right");
            System.out.println("2. Display Array");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of rotations (k): ");
                    int k = sc.nextInt();
                    ArrayService.rotateRight(arr, k);
                    System.out.println("Array after rotation:");
                    ArrayService.displayData(arr);
                    break;

                case 2:
                    System.out.println("Current Array:");
                    ArrayService.displayData(arr);
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 3);

        sc.close();
    }
}
