package beautychu.domain;

import java.io.Serializable;

public class MyChu implements Serializable {

	private static final long serialVersionUID = 1L;

	int myChuNo;
	int styleNo;
	String email;
	
	
	public int getMyChuNo() {
		return myChuNo;
	}
	public void setMyChuNo(int myChuNo) {
		this.myChuNo = myChuNo;
	}
	public int getStyleNo() {
		return styleNo;
	}
	public void setStyleNo(int styleNo) {
		this.styleNo = styleNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
