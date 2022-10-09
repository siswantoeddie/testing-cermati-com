package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
	
public WebDriver ldriver;
	
	public registerPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	// find element
	By txtEmail= By.xpath("//input[@id='email']");
	By txtPhoneNo = By.id("mobilePhone");
	By txtPassword = By.name("password");
	By txtConfirmPassword = By.cssSelector("#confirmPassword");
	By txtFirstName = By.xpath("//input[@id='firstName']");
	By txtLastName = By.xpath("//input[@id='lastName']");
	By txtCity = By.xpath("//input[@id='cityAndProvince']");
	By sggList = By.xpath("//button[contains(text(),'KOTA BOGOR')]");
	By btnRegister = By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[2]/div[2]/div[1]/button[1]");
	
	// action method
	public void setEmail(String email) throws InterruptedException{
		Thread.sleep(2000);
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setPhoneNumber(String phone) throws InterruptedException{
		Thread.sleep(2000);
		ldriver.findElement(txtPhoneNo).sendKeys(phone);
	}
	
	public void setPassword(String pwd) throws InterruptedException{
		Thread.sleep(2000);
		ldriver.findElement(txtPassword).sendKeys(pwd);
	}
	
	public void setConfirmationPassword(String pass){
		ldriver.findElement(txtConfirmPassword).sendKeys(pass);
	}
	
	public void setFirstName(String fname){
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname){
		ldriver.findElement(txtLastName).sendKeys(lname);
	}
	
	public void setCity(String city){
		ldriver.findElement(txtCity).sendKeys(city);
	}
	
	public void setSggList() throws InterruptedException{
		Thread.sleep(3000);
		ldriver.findElement(sggList).click();
	}
	
	public void clickBtnRegister() throws InterruptedException{
		Thread.sleep(2000);
		ldriver.findElement(btnRegister).click();
	}

}
