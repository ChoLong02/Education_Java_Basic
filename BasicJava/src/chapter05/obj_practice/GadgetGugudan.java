package chapter05.obj_practice;

public class GadgetGugudan {
    
    public void printGugu(int num) {
          int result = 0;
          for(int i = 1; i <= 9; i++) {
               result = num * i;
          System.out.println(num + " X " + i + " = " + result);
          }
    }
}
