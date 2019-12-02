package chapter05;

import java.util.Date;

public class BoardDTO {
	private String bno;
	private String writer;
	private String content;
	private String title;
	private Date regdate;
	
	public BoardDTO() {
	}

	public BoardDTO(String bno, String writer, String content, String title, Date regdate) {
		super();
		this.bno = bno;
		this.writer = writer;
		this.content = content;
		this.title = title;
		this.regdate = regdate;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", writer=" + writer + ", content=" + content + ", title=" + title
				+ ", regdate=" + regdate + "]";
	}
	
	
	
}
