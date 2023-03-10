package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.print("r : ");
        Scanner input =  new Scanner((System.in));
        int radiusInput = input.nextInt();
        if(radiusInput <= 0 ) {
            System.out.println(" not null or zero r");
        }
        int diameter = (int) Math.pow(radiusInput,2);
        float masahat = (float) (diameter* Math.PI);
        double mohit = (double) radiusInput * Math.PI * 2;
        System.out.println("masahat = "+ masahat);
        System.out.println("mohit = "+ mohit);
    }
}