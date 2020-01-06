package market;

import java.util.Date;

public class SaleDTO {
	private int sno;
	private String sname;
	private int cnt;
	private int tprice;
	private Date date;
	
	public SaleDTO() {}

	public SaleDTO(int sno, String sname, int cnt, int tprice, Date date) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.cnt = cnt;
		this.tprice = tprice;
		this.date = date;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getTprice() {
		return tprice;
	}

	public void setTprice(int tprice) {
		this.tprice = tprice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return sno + "\t" + 
	           sname + "\t" +
			   cnt + "\t" +
	           tprice + "\t" +
			   date;
	}
	
	
}
