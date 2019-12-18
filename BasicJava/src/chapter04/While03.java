package chapter04;

// 1~100 총합 구하기(2의 배수 빼고)
public class While03 {
    public static void main(String[] args) {
          
          // 1~100까지 합 구하는 코드 작성
          
          int num = 1;  // 1씩 +해서 100까지
          int total = 0; // 1~100까지 총합
          
          while(num <= 100) {
               
               // 2의 배수는 더하지 않음
               if(num % 2 == 0) { // 짝수인 경우
                    num++;
                    continue;  
               }
               total = total + num;
               System.out.println(num + " 반복" + ", 총합 : "+ total);
               num++;
          }
          
          System.out.println("Real 총합 : " + total);
    }
}
