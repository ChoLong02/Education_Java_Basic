package chapter05;

//DB Transfer(데이터를 전송하는 기능 : 가방)
public class ModelDTO {
	  // DTO에 들어오는 것
	  // 1. 변수(id, pw, name 등)
	  private String id;
	  private String pw;
	  private String name;
	  private String phone;
	  private String addr;
	  private String email;
	  private String birth;
	  
	  // 2. 생성자
	  //  1) 기본생성자 생성
	  public ModelDTO() {
	        
	  }
	  //  2) 변수 전체를 포함하는 생성자 생성(Source -> Constructor  using Fields)
	  // 회원가입
	  public ModelDTO(String id, String pw, String name, String  phone, String addr, String email, String birth) {
	        super();
	        this.id = id;
	        this.pw = pw;
	        this.name = name;
	        this.phone = phone;
	        this.addr = addr;
	        this.email = email;
	        this.birth = birth;
	  }
	  
	  // 로그인
	  public ModelDTO(String id, String pw) {
	        super();
	        this.id = id;
	        this.pw = pw;
	  }
	  
	  // 회원수정
	  public ModelDTO(String pw, String name, String phone,  String addr, String email, String birth) {
	        super();
	        this.pw = pw;
	        this.name = name;
	        this.phone = phone;
	        this.addr = addr;
	        this.email = email;
	        this.birth = birth;
	  }
	  
	  // 3. getter & setter() 메서드 (Source -> getters and  setters)
	  public String getId() {
	        return id;
	  }
	  public void setId(String id) {
	        this.id = id;
	  }
	  public String getPw() {
	        return pw;
	  }
	  public void setPw(String pw) {
	        this.pw = pw;
	  }
	  public String getName() {
	        return name;
	  }
	  public void setName(String name) {
	        this.name = name;
	  }
	  public String getPhone() {
	        return phone;
	  }
	  public void setPhone(String phone) {
	        this.phone = phone;
	  }
	  public String getAddr() {
	        return addr;
	  }
	  public void setAddr(String addr) {
	        this.addr = addr;
	  }
	  public String getEmail() {
	        return email;
	  }
	  public void setEmail(String email) {
	        this.email = email;
	  }
	  public String getBirth() {
	        return birth;
	  }
	  public void setBirth(String birth) {
	        this.birth = birth;
	  }
	  
	  // 4. toString() (Source -> toString())
	  @Override
	  public String toString() {
	        return "ModelDTO [id=" + id + ", pw=" + pw + ",  name=" + name + ", phone=" + phone + ", addr=" + addr
	              + ", email=" + email + ", birth=" + birth  + "]";
	  }
}
