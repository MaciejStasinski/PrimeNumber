package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        String n = scanner.nextLine();
        int a= Integer.parseInt(n);
        int dividedCompletely=0;
        for (int i=1;i<=a+1;i++){
            if (a%i==0)
                dividedCompletely++;
        }
        if (dividedCompletely<=2)
            System.out.println("prime");
        else
            System.out.println("not prime");

        //Another version:
//        BigInteger a= new BigInteger(n);
//        if (a.isProbablePrime(1))
//            System.out.println("prime");
//        else
//            System.out.println("not prime");
    }
}
