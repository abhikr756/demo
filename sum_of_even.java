package com.company;
import java.util.Scanner;
public class sum_of_even {
    public static void main(String[] args) {
        System.out.println("Input the number");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            sum=sum+(2*i);
            System.out.print("sum of even number is :");
            System.out.println(sum);

    }
}
