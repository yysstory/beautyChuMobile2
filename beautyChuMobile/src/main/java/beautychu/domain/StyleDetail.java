package beautychu.domain;

import java.io.Serializable;
import java.util.List;

public class StyleDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	int styleNumber;
	String styleName;
	String styleIntro;
	int stylePrice;
	String email;
	List<?> stylePhoto;
	String shopName;
	String shopAddress;
	String shopPhoneNumber;
	String shopMainImage;
	String shopIntro;
	List<?> commentList;
	int chuCount;
	
	

	public String getShopMainImage() {
		return shopMainImage;
	}
	public void setShopMainImage(String shopMainImage) {
		this.shopMainImage = shopMainImage;
	}
	public String getShopIntro() {
		return shopIntro;
	}
	public void setShopIntro(String shopIntro) {
		this.shopIntro = shopIntro;
	}
	public int getChuCount() {
		return chuCount;
	}
	public void setChuCount(int chuCount) {
		this.chuCount = chuCount;
	}
	public int getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
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
	public int getStylePrice() {
		return stylePrice;
	}
	public void setStylePrice(int stylePrice) {
		this.stylePrice = stylePrice;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<?> getStylePhoto() {
		return stylePhoto;
	}
	public void setStylePhoto(List<?> stylePhoto) {
		this.stylePhoto = stylePhoto;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopPhoneNumber() {
		return shopPhoneNumber;
	}
	public void setShopPhoneNumber(String shopPhoneNumber) {
		this.shopPhoneNumber = shopPhoneNumber;
	}
	public List<?> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<?> commentList) {
		this.commentList = commentList;
	}
	
	@Override
	public String toString() {
		return "StyleDetail [styleNumber=" + styleNumber + ", styleName="
				+ styleName + ", styleIntro=" + styleIntro + ", stylePrice="
				+ stylePrice + ", email=" + email + ", stylePhoto="
				+ stylePhoto + ", shopName=" + shopName + ", shopAddress="
				+ shopAddress + ", shopPhoneNumber=" + shopPhoneNumber
				+ ", commentList=" + commentList + "]";
	}
	
	
	
}
