
package com.demo.test;

import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String str = sc.nextLine();
	    boolean isAlphanumeric = true;
	    for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric)
            System.out.println("String contains only alphanumeric characters.");
        else
            System.out.println("String contains special characters or spaces.");

        sc.close();
	}
	
}
