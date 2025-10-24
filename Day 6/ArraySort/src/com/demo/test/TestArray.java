package com.demo.test;

import java.util.Scanner;
import com.demo.service.ArrayService;

public class TestArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        System.out.println("Enter elements for first array:");
        ArrayService.acceptData(nums1);
        System.out.println("First array:");
        ArrayService.displayData(nums1);

        System.out.print("\nEnter size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        System.out.println("Enter elements for second array:");
        ArrayService.acceptData(nums2);
        System.out.println("Second array:");
        ArrayService.displayData(nums2);

        int choice = 0;
        do {
            System.out.println("\n1. Merge Arrays");
            System.out.println("2. Display Arrays");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int[] merged = ArrayService.mergeArray(nums1, nums2);
                    System.out.println("Merged Array:");
                    ArrayService.displayData(merged);
                    break;

                case 2:
                    System.out.println("Array 1:");
                    ArrayService.displayData(nums1);
                    System.out.println("Array 2:");
                    ArrayService.displayData(nums2);
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Wrong choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
