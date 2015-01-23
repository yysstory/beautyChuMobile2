package beautychu.domain;

import java.io.Serializable;
import java.util.List;

public class Style implements Serializable {

	private static final long serialVersionUID = 1L;

	int styleNumber;
	String people;
	String gender;
	String styleLength;
	String styleName;
	String styleIntro;
	int price;
	String email;
	String mainPhoto;
	
	
	
	public int getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStyleLength() {
		return styleLength;
	}
	public void setStyleLength(String styleLength) {
		this.styleLength = styleLength;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getStyleIntro() {
		return styleIntro;
	}
	public void setStyleIntro(String styleIntro) {
		this.styleIntro = styleIntro;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMainPhoto() {
		return mainPhoto;
	}
	public void setMainPhoto(String mainPhoto) {
		this.mainPhoto = mainPhoto;
	}
	
	
	
}
