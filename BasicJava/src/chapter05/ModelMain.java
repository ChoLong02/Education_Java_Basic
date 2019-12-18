package chapter05;

public class ModelMain {
    public static void main(String[] args) {
          String id = "parks03";
          String pw = "cc12345";
          String name = "박선미";
          String phone = "01012345678";
          String addr = "광주광역시 남구";
          String email = "parks03@naver.com";
          String birth = "930325";
          
          // 2. 객체생성
          // 생성자는 객체생성과 동시에 인스턴스를 사용하기 전에  변수를 초기화하거나 메서드를 실행시킬때 사용
          ModelDTO mDto2 = new ModelDTO(); // 객체생성 후  인스턴스 사용
          mDto2.setId(id);
          mDto2.setPw(pw);
          mDto2.setName(name);
          mDto2.setPhone(phone);
          mDto2.setAddr(addr);
          mDto2.setEmail(email);
          mDto2.setBirth(birth);
          
          ModelDTO mDto = new ModelDTO(id, pw, name, phone,  addr, email, birth); // 객체를 생성함과 동시에 변수를 초기화하거나  매서드를 실행(생성자의 특징, 주로 초기화하는 데 쓰임)
          ModelDAO mDao = new ModelDAO();
          
          // 3. 인스턴스 사용
          mDao.memJoin(mDto);
          
          // ModelDTO는 객체생성(2)
          // ModelDAO는 객체생성(2) 및 인스턴스 사용(3)
          
    }
}
