package chapter05;

public class OverLoading01 {
    
    // 기본 생성자(default 생성자)
    public OverLoading01() {
    }
    public OverLoading01(int num, String name) {
    }
    public OverLoading01(double num, String name) {
    }
    public OverLoading01(String name, double num) {
    }
    // 기본적으로 매서드의 이름은 중복돼서 사용불가
    // 오버로딩을 사용하면 매서드 이름을 중복해서 사용가능, but  조건이 있음(조건:or)
    // 1. 매개변수에 개수가 달라야함
    // 2. 매개변수에 개수가 같다면 데이터 타입이 달라야함
    // 3. 매개변수에 개수와 타입이 같다면, 순서가 달라야함
}
