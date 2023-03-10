package javalike.Example;

import java.util.Scanner;

public class MoadeleD2 {

   public static void main(String[] args) {
       Scanner intput = new Scanner(System.in);
       int a, b, c, delta;
       double x1, x2;
       System.out. print("Enter a:");
       a = intput.nextInt();
       System.out. print("Enter b:");
        b = intput.nextInt();
       System.out. print("Enter c:");
        c = intput.nextInt();
       delta = b * b - 4 * a * c;
       if (delta > 0) {
           x1 = (-b + Math.sqrt((double) delta)) / (2 * a);
           x2 = (-b - Math.sqrt((double) delta)) / (2 * a);
           System.out. print("x1=" + (x1 + ""). substring (0, 5));
           System.out. print("x2=" + (x2 + ""). substring (0, 5));
       } else if (delta == 0) {
           x1 = -b / (2 * a);
           System.out. print("x1= " + (x1 + ""). substring (0, 3));
       } else if (delta < 0)
           System.out. print("Rishe Nadarad.");
   }
}