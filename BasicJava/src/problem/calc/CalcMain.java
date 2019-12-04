package problem.calc;

import java.util.Scanner;

// 사칙연산이 가능한 계산기 프로그램
public class CalcMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculater calc = new Calculater();
		
		
		while(true) {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("▒▒ 더하고나누고 Ver1.0");
			System.out.print("▒▒ 숫자>>");
			int first = sc.nextInt();
			System.out.print("▒▒ 연산   자(+,-,x,/)>>");
			sc.nextLine(); // 한줄개행 막음!
			String oper = sc.nextLine();
			System.out.print("▒▒ 숫자>>");
			int second = sc.nextInt();
			
			// System.out.println(first+","+oper+","+second);
			int result = 0;
			if(oper.equals("+")) {
				result = calc.sum(first, second);
			} else if(oper.equals("-")) {
				result = calc.sub(first, second);
			} else if(oper.equals("*")) {
				result = calc.multi(first, second);
			} else if(oper.equals("/")) {
				result = calc.div(first, second);
			}
			
			// 결과 출력
			System.out.println("▒▒ "+first+oper+second+"="+result);
		}
	}
}






