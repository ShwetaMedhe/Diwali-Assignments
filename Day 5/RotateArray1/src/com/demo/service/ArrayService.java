package com.demo.service;

import java.util.Scanner;

public class ArrayService {

    public static void acceptData(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void displayData(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle if k > n
        if (k == 0) return;

        int[] temp = new int[n];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[k + i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
