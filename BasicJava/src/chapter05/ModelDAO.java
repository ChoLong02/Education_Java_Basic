package chapter05;
//DB를 Access하는 기능
//ex) 회원가입, 회원수정, 회원탈퇴, 회원조회 등
public class ModelDAO {
    // 회원가입
    public void memJoin(ModelDTO mDto) {
          System.out.print(mDto.getId() + ", ");
          System.out.print(mDto.getPw() + ", ");
          System.out.print(mDto.getName() + ", ");
          System.out.print(mDto.getPhone() + ", ");
          System.out.print(mDto.getAddr() + ", ");
          System.out.print(mDto.getEmail() + ", ");
          System.out.println(mDto.getBirth() + ", ");
          System.out.println("회원을 가입시킨다.");
    }
}