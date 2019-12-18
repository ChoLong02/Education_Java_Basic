package chapter04;

public class StarPrint {
    public static void main(String[] args) {
          int i = 0;
          
          for(i = 1; i <= 5; i++) { // Line
               
               for(int j = 0; j < i; j++) { // * 찍기
                    System.out.print("*");
               }
               System.out.println(); // 개행
          }
    }
}
