package chapter04;

//  1~100 총합 구하기
public class While02 {
    public static void main(String[] args) {
          
          // 1~100까지 합 구하는 코드 작성
          
          int num = 1;  // 1씩 +해서 100까지
          int total = 0; // 1~100까지 총합
          
          while(num <= 100) {
               
               total = total + num;
               System.out.println(num + " 반복" + ", 총합 : "+
               total);
               
               if(total >= 1000) {
                    break;
               }
               num++;
          }
          System.out.println("Real 총합 : " + total);
    }
}
