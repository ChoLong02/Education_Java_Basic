package chapter04;

import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int temp = 0;
          
          System.out.print("첫번째 수 : ");
          int num1 = sc.nextInt();
          System.out.print("두번째 수 : ");
          int num2 = sc.nextInt();
          System.out.print("세번째 수 : ");
          int num3 = sc.nextInt();
          
          if(num1 < num2) {
               temp = num1;
               num1 = num2;
               num2 = temp;
          }
          if(num1 < num3) {
               temp = num1;
               num1 = num3;
               num3 = temp;
          }
          if(num2 < num3) {
               temp = num2;
               num2 = num3;
               num3 = temp;
          }
          
    System.out.println(num1 + " > " + num2 + " > " + num3);
    
    }
}
