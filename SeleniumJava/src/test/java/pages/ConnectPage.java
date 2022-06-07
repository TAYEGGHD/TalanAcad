package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConnectPage {
	protected WebDriver driver;

	private By txt_username = By.name("userName");

	private By txt_password = By.name("password");
	
	private By btn_submit = By.name("submit");
	
	public ConnectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String username) {
		
		driver.findElement(txt_username).sendKeys(username);		
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);		
	}
	public void clickSubmit() {
	driver.findElement(btn_submit).click();
}
	public void connectValidUser(String username, String password) {

		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_submit).click();
	}
	
}
