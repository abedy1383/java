package javalike .Example;

import java.util.Scanner;

public class Bubble_Sort {
  public static void main(String[] args) {
      Scanner intput = new Scanner(System.in);
      int a[];
      int n;
      int i;
      System.out.print("Enter shape array: ");
      n = intput.nextInt();
      a = new int[n];
      for (i = 0; i < n; i++) {
          System.out.print("Enter number " + (i + 1) + ": ");
          a[i] = intput.nextInt();
      }
      for (i = 0; i < n; i++) {//algoritm Bubble Sort
          for (int j = 0; j < n - 1; j++) {
              if (a[j] > a[j + 1]) {
                  int temp = a[j];
                  a[j] = a[j + 1];
                  a[j + 1] = temp;
              }
          }
      }
      for (i = 0; i < n; i++) {
          System.out.print(a[i] + "\t");
      }
  }
}