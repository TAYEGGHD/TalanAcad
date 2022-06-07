package StepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConnectPage;


public class ConnectSteps_POM {
	WebDriver driver = null;
	ConnectPage connect;
	

@SuppressWarnings("deprecation")
@Given("user is on the login page of the site")
public void user_is_on_the_login_page_of_the_site() {
	
	System.out.println("=====connectsteps_POM=====");
	System.out.println("user is on the login page of the site");
	

	System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	
	driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");
}

@When("^user enters (.*) and (.*)$")
public void user_enters_username_and_password (String username, String password) {
	
    connect = new ConnectPage(driver);
	connect.enterUserName(username);
	connect.enterPassword(password);
	
	//driver.findElement(By.name("userName")).sendKeys("username");
	//driver.findElement(By.name("password")).sendKeys("password");
}

@And("user clicks on submit")
public void user_clicks_on_submit() {
	
	connect.clickSubmit();
	//driver.findElement(By.name("submit")).click();
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	System.out.println("user is navigated to the home page");
}
}
