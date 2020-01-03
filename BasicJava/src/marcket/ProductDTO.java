package marcket;

import java.util.Date;

public class ProductDTO {
	private int pno;
	private String pname;
	private String company;
	private int price;
	private int cnt;
	private Date date;
	
	public ProductDTO() {}

	public ProductDTO(int pno, String pname, String company, int price, int cnt, Date date) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.company = company;
		this.price = price;
		this.cnt = cnt;
		this.date = date;
	}

	
	public ProductDTO(String pname, String company, int price, int cnt) {
		super();
		this.pname = pname;
		this.company = company;
		this.price = price;
		this.cnt = cnt;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ProductDTO [pno=" + pno + ", pname=" + pname + ", company=" + company + ", price=" + price + ", cnt="
				+ cnt + ", date=" + date + "]";
	}
	
}
