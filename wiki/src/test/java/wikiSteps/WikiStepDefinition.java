package wikiSteps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WikiStepDefinition {
	
	private WebDriver driver;
	
	@Given("^user is on wikipedia\\.org$")
	public void user_is_on_wikipedia_org() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\savuda\\Downloads\\BDD_Files\\chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
	}

	@Then("^title wikipedia$")
	public void title_wikipedia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(driver.getTitle());
	}
	
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\savuda\\Downloads\\BDD_Files\\chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
	}
	
	@When("^user enters a search keyword$")
	public void user_enters_a_search_keyword() throws InterruptedException  {
	driver.findElement(By.name("search")).sendKeys("Area 51");;
	Thread.sleep(5000);
	}

	@When("^user clicks on search button$")
	public void user_clicks_on_search_button() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).submit();
		Thread.sleep(2000);
	}

	@Then("^it open a corresponding wiki page$")
	public void it_open_a_corresponding_wiki_page()  {
		String exp=driver.getTitle();
		assertEquals("Area 51 - Wikipedia", exp);
	
	}

}
