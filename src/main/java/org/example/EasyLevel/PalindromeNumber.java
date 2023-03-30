package org.example.EasyLevel;

public class PalindromeNumber {
    /*Given an integer x, return true if x is a palindrome, and false otherwise.*/

    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(x));
        String reverseX = String.valueOf(stringBuilder.reverse());
        if (Integer.toString(x).equals(reverseX)) {
            System.out.println("Number is palindrome");
            return true;
        } else {
            System.out.println("Number is not a palindrome");
            return false;
        }
    }
}
