package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[10];
        for(int i = 0; i<10;i++){
            arr[i]=sc.nextInt();
        }
        int n= sc.nextInt();
        for(int i=0;i<10;i++){
            if (arr[i]==n)
                System.out.println("found at index = "+i);
        }
    }


}

