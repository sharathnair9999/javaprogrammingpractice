package com.company;

import java.io.*;
import java.util.Scanner;

class FindMissingAndRepeating {
    static int x, y;

    static void getTwoElements(int arr[], int n)
    {
        int xor1;

        int set_bit_no;

        int i;
        x = 0;
        y = 0;

        xor1 = arr[0];

        for (i = 1; i < n; i++)
            xor1 = xor1 ^ arr[i];

        for (i = 1; i <= n; i++)
            xor1 = xor1 ^ i;

        set_bit_no = xor1 & -xor1;

        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0)
                x = x ^ arr[i];

            else
                y = y ^ arr[i];
        }
        for (i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0)
                x = x ^ i;

            else
                y = y ^ i;
        }
        System.out.println("The missing element is  "
                + x + " and the "
                + "repeating number is "
                + y);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        getTwoElements(arr, n);
    }
}