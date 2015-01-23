package beautychu.domain;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {

	private static final long serialVersionUID = 1L;

	String email;
	String licenseNumber;
	String shopName;
	String shopAddress;
	String shopPhoneNumber;
	String shopIntro;
	String shopMainImage;
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
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
	public String getShopIntro() {
		return shopIntro;
	}
	public void setShopIntro(String shopIntro) {
		this.shopIntro = shopIntro;
	}
	public String getShopMainImage() {
		return shopMainImage;
	}
	public void setShopMainImage(String shopMainImage) {
		this.shopMainImage = shopMainImage;
	}

}
