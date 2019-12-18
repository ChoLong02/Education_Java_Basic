package chapter04;

import java.util.Scanner;

public class IfElse02 {
	public static void main(String[] args) {
        
        // A : 100 ~ 91
        // B : 90 ~ 81
        // C : 80 ~ 71
        // D : 70 ~ 61
        // F : 60이하
        // 이름, 점수, 학점 만들기
        
        String name = "박선미"; // 이름
        int score = 85; // 점수
        String grade = ""; // 학점
        int flag = 0;
        
        if(score > 100 || score <0) {
             System.out.println("잘못 입력하셨습니다.");
             flag = 1;
        } else if((100 >= score) && (score >= 91)) { // 1번
             // 1번의 조건이 참이면 실행 됨
             grade = "A";
        } else if(score >= 81) {
             grade = "B";
        } else if(score >= 71) {
             grade = "C";
        } else if(score >= 61) {
             grade = "D";
        } else {
             grade = "F";
             // 위의 조건들이 모두 false일 때 실행 됨
        }
        
        // if문
        // if~else문
        // if~elseif문
        // if~elseif~else문
        if(flag == 0) {
        System.out.println(name + "학생의 점수는 " + score +  "점으로 " + grade + "학점입니다.");
        }
	}
}
