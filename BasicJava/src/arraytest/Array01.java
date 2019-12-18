package arraytest;

public class Array01 {
    public static void main(String[] args) {
          // 배열은 객체자료형
          // index를 사용해서 접근(0번지부터)
          // 고정된 크기(유동적으로 변함x)
          // 배열은 참조변수기 때문에 ""으로 초기화
          // 배열은 type이 일치해야 한다
          // for문과 함께 자주 사용된다
          
          // 배열은 선언과 동시에 초기화
          int[] mathScore = {100, 95, 75}; // = int  mathScore[];
          
          // 정수형 타입의 30크기의 배열을 생성
          int[] engScore = new int[30]; // 값을 나중에 받으려면  사이즈값만 입력
          
          engScore[0] = 100;
          engScore[1] = 90;
          engScore[2] = 80;
          engScore[15] = 65;
          engScore[29] = 92;
          
               // length = 배열의 크기
          for (int i = 0; i < engScore.length; i++) {
               System.out.println(i + "번지 : " + engScore[i]);
          }
    }
}
