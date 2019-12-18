package chapter10;

import java.util.Scanner;

public class ToyMain {
    public static void main(String[] args) {
          // 장난감 공장
          // 1. 마징가z
          // 2. Pooh
          // 3. 전투인형 바비
          
          Scanner sc = new Scanner(System.in);
          System.out.println("ToyStory Ver1.0");
          System.out.println("제작할 인형을 선택하세요.");
          System.out.println("1. 마징가 Z");
          System.out.println("2. 곰돌이 Pooh");
          System.out.println("3. 전투인형 바비");
          System.out.print(" 선택 > ");
          int num = sc.nextInt();
          
          // 다형성 사용, 같은 타입으로 만들어줌
          IToy mazinger;
          IToy pooh;
          IToy barbie;
          
          ToyMain tm = new ToyMain();
          
          if(num == 1) {
               mazinger = new MazingerToyImpl();
               tm.makeToy(mazinger);
          } else if(num == 2) {
               pooh = new PoohToyImpl();
               tm.makeToy(pooh);
          } else if(num == 3) {
               barbie = new BarbieToyImpl();
               tm.makeToy(barbie);
          }
          
    }
    
    public void makeToy(IToy toy) {
          System.out.println("인형제작 Start!");
          System.out.println("=>");
          System.out.println("==>");
          System.out.println("===>");
          System.out.println("====>");
          System.out.println("인형제작 Complete!");
    }
}

