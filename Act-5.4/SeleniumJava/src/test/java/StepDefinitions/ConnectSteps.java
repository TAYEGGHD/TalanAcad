package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnectSteps {
	WebDriver driver = null;
	
@Given("user is on the login page of the site")
public void user_is_on_the_login_page_of_the_site() {
	driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");
}

@When("user enters user1 and qwerty.{int}")
public void user_enters_user1_and_qwerty(Integer int1) {
	driver.findElement(By.name("userName")).sendKeys("User1");
	driver.findElement(By.name("password")).sendKeys("qwerty.5");
}

@And("user clicks on submit")
public void user_clicks_on_submit() {
	driver.findElement(By.name("submit")).click();
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	System.out.println("user is navigated to the home page");
}
}
