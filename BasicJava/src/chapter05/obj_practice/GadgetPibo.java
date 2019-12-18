package chapter05.obj_practice;

public class GadgetPibo {
    public int printPibo(int num1, int num2) {
          int i = 0;
          int temp = 0;
          for(i = 1; i <= 10; i++) {
               temp = num1 + num2;
               num1 = num2;
               num2 = temp;
               System.out.println(num1);
          }
          return num1;
    }
}
