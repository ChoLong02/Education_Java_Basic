package arraytest;

import java.util.Scanner;

public class ArrayScore {
    public static void main(String[] args) {
          // 키보드로 3개의 숫자를 입력받음(키보드로 입력받을 때마다  배열에)
          // 1값 입력 -> 배열
          // 2값 입력 -> 배열
          // 3값 입력 -> 배열
          // 3개의 숫자를 배열에 집어 넣고
          // 배열에 있는 3개의 숫자값을 출력하는 코드
          Scanner sc = new Scanner(System.in);
          int[] score = new int[3];
          for (int i = 0; i < score.length; i++) {
               System.out.print("num" + (i + 1) + " : ");
               score[i] = sc.nextInt();
          }
          for (int i = 0; i < score.length; i++) {
               System.out.println(i + "번지 : " + score[i]);
          }
    }
}