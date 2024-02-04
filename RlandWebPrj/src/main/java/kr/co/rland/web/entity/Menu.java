package kr.co.rland.web.entity;

import java.util.Date;

public class Menu {
	
	  private int id;
	  private String korName;
	  private String engName; 
	  private int price; 
	  private String img; 
	  private int like; 
	  private Date regDate;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKorName() {
		return korName;
	}

	public void setKorName(String korName) {
		this.korName = korName;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", korName=" + korName + ", engName=" + engName + ", price=" + price + ", img=" + img
				+ ", like=" + like + ", regDate=" + regDate + "]";
	}
	  
}
