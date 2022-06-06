package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {
	
	WebDriver driver = null;
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters the url of the site in search box")
	public void user_enters_the_url_of_the_site_in_search_box() {
		System.out.println("Inside Step - user enters the url of the site in search box");
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step - user hits enter");
	}

	@Then("user is directed to the home page of the site")
	public void user_is_directed_to_the_home_page_of_the_site() {
		System.out.println("Inside Step - user is directed to the home page of the site");
	}

	@Given("user is on the site home page")
	public void user_is_on_the_site_home_page() {
		System.out.println("Inside Step - user is on the site home page");
	}

	@When("user clicks on Register")
	public void user_clicks_on_register() {
		System.out.println("user clicks on Register");
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Then("user is directed to register page")
	public void user_is_directed_to_register_page() {
		System.out.println("user is directed to register page");

	}

	@Given("user is on the site register page")
	public void user_is_on_the_site_register_page() {
		System.out.println("user is on the site register page");
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	}

	@When("user enters informations")
	public void user_enters_informations() {
		driver.findElement(By.name("firstName")).sendKeys("name1");
		driver.findElement(By.name("lastName")).sendKeys("Lastname1");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("userName")).sendKeys("name@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Rue de la bource");
		driver.findElement(By.name("city")).sendKeys("Tunis");
		driver.findElement(By.name("state")).sendKeys("Tunis");
		driver.findElement(By.name("postalCode")).sendKeys("2035");
		driver.findElement(By.name("country")).sendKeys("Tunisia");
		driver.findElement(By.name("email")).sendKeys("User1");
		driver.findElement(By.name("password")).sendKeys("qwerty.5");
		driver.findElement(By.name("confirmPassword")).sendKeys("qwerty.5");
		driver.findElement(By.name("submit")).click();
	}

	@And("clicks on envoyer")
	public void clicks_on_envoyer() {
		System.out.println("clicks on envoyer");
		driver.findElement(By.linkText("REGISTER")).click();	
	}

	@Then("user is registered")
	public void user_is_registered() {
		System.out.println("Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		driver.navigate().to("https://demo.guru99.com/test/newtours/register_sucess.php");
		
		driver.close();
		driver.quit();
	}
}

