package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccessSiteSteps {
	
	WebDriver driver = null;
	
	@Given("^browser is open$")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open");
		System.setProperty("webdriver.chrome.driver","/src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	}

	@And("^user is on google search page$")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - user is in google search page");
		driver.navigate().to("https://google.com");
	}


	@When("user enters url of the site in search box")
	public void user_enters_url_of_the_site_in_search_box()  {
		System.out.println("Inside Step - user enters url of the site in search box");

		driver.navigate().to("https://todomvc.com/examples/react/#/");
	}

	@And("^hits enter$")
	public void hits_enter()  {
		System.out.println("Inside Step - user hits enter");
	 
	}

	@Then("^user is directed to the home page of the site$")
	public void user_is_directed_to_the_home_page_of_the_site()  {
		System.out.println("Inside Step - user is directed to the home page of the site");
	}

}
