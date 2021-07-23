package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://ui.cogmento.com/");

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("shwetamurkute28@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Sanvi@19");
		 Thread.sleep(3000);
		   driver.findElement(By.xpath("//div[text()='Login']")).click();

	}

	@Then("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		String actualtitle=driver.getTitle();
		   Assert.assertEquals(actualtitle, "Cogmento CRM");
			Thread.sleep(3000);


	}

	@Then("user click on contact link")
	public void user_click_on_contact_link() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();

	}

	@Then("user goes to create page and enter fname and last name")
	public void user_goes_to_create_page_and_enter_fname_and_last_name() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
		  driver.findElement(By.name("first_name")).sendKeys("shweta");
		  driver.findElement(By.name("last_name")).sendKeys("patil");
			Thread.sleep(5000);

		  driver.close();

	}

	@Then("user click on deal link")
	public void user_click_on_deal_link() throws InterruptedException {
		Thread.sleep(5000);
		   driver.findElement(By.xpath("//a[@href='/deals']")).click();
			Thread.sleep(5000);


	}

	@Then("user goes to deals page and click on other link")
	public void user_goes_to_deals_page_and_click_on_other_link() {
		driver.findElement(By.xpath("//a[@href='/deals/new']")).click();
		driver.findElement(By.name("title")).sendKeys("Automation test engineer");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		   
		driver.close();

	}

}
