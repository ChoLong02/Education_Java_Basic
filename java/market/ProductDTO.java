package market;

import java.util.Date;

public class ProductDTO {
	private int pno;
	private String pname;
	private int pprice;
	private int pcnt;
	private Date regdate;
	
	public ProductDTO() {}

	public ProductDTO(String pname, int pprice, int pcnt) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pcnt = pcnt;
	}

	public ProductDTO(int pno, String pname, int pprice, int pcnt, Date regdate) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pprice = pprice;
		this.pcnt = pcnt;
		this.regdate = regdate;
	}
	
	

	public ProductDTO(int pno, int pprice) {
		super();
		this.pno = pno;
		this.pprice = pprice;
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

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public int getPcnt() {
		return pcnt;
	}

	public void setPcnt(int pcnt) {
		this.pcnt = pcnt;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "ProductDTO [pno=" + pno + ", pname=" + pname + ", pprice=" + pprice + ", pcnt=" + pcnt + ", regdate="
				+ regdate + "]";
	}
	
}




