package chapter04;

public class For01 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
             
             total = total + i;
        }
        System.out.print("1~5까지의 합은 ");
        System.out.print(total + "입니다.");
	}
}
