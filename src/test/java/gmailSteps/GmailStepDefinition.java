package gmailSteps;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.*;

	public class GmailStepDefinition  {
		
		WebDriver driver;
		@Given("User launches the chrome Browser")
		public void user_launches_the_chrome_browser() {
		   driver= new ChromeDriver();
		}
		@Given("enters the URL {string}")
		public void enters_the_url(String url) {
		    driver.get(url);
		}
		@When("User enters the {string} and {string}")
		public void user_enters_the_and(String email, String password) {
		   By username= By.id("identifierId");
		   driver.findElement(username).sendKeys(email);
		   driver.findElement(By.xpath("//span[text()='Next']")).click();
		   By pass= By.name("Passwd");
		   driver.findElement(pass).sendKeys(password);
		   
		}
		@When("clicks on login button")
		public void clicks_on_login_button() {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		@Then("Dashboard Tittle")
		public void dashboard_tittle() {
		   String gmailtitle=driver.getTitle();
		   System.out.println(gmailtitle);
		}
	}

