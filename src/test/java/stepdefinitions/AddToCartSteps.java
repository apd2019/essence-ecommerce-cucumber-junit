package test.java.stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartSteps {
	WebDriver driver;

	@Given("the user opens the e-commerce application")
	public void the_user_opens_the_e_commerce_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/ecomm/ATE_PEP2_Testing_Using_TestNG/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("the user clicks on the Add to Cart button")
	public void the_user_clicks_on_the_add_to_cart_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions a1 = new Actions(driver);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".owl-stage")));
		List<WebElement> cardList = driver.findElements(By.cssSelector(".owl-item"));
		for (WebElement card : cardList) {
			if (card.getText().contains("PETITE Belted Jumper Dress")) {
				System.out.println("Found the dress: " + card.getText());
				a1.moveToElement(card).perform();
				WebElement addToCartBtn = card.findElement(By.xpath(".//a[contains(@class, 'btn')]"));
				addToCartBtn.click();

			} else {
				System.out.println("nothing found!");
			}
		}

	}

	@Then("the item should be added to the cart")
	public void the_item_should_be_added_to_the_cart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {

			driver.findElement(By.xpath("//div[@class='cart-area']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart-item-desc")));
			List<WebElement> cardListCart = driver.findElements(By.cssSelector(".cart-item-desc"));
			for (WebElement card1 : cardListCart) {
				if (card1.getText().contains("PETITE Belted Jumper Dress")) {
					System.out.println("Found the clothe: " + card1.getText());
				} else {
					System.out.println("Nothing found in cart! only these- " + card1.getText());
				}
			}
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	@When("the user clicks on the Checkout button")
	public void the_user_clicks_on_the_checkout_button() {
		driver.findElement(By.xpath("(//a[@href='checkout.html'])[2]")).click();
	}

	@Then("the user is navigated to the Billing Address page")
	public void the_user_is_navigated_to_the_billing_address_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement billingPageHeader = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//div[contains(@class,'cart-page-heading')])[1]")));
		System.out.println(billingPageHeader.getText());
	}

	@When("the user enters billing details")
	public void the_user_enters_billing_details() {
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstName.sendKeys("Test");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastName.sendKeys("Test2");
		
		WebElement compName = driver.findElement(By.xpath("//input[@id='company']"));
		compName.sendKeys("TestCompany");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'nice-select')]")));
		WebElement cntrDrpDn = driver.findElement(By.xpath("//div[contains(@class,'nice-select')]"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(cntrDrpDn).click().build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li[@data-value='ind']")));
		WebElement countryName = driver.findElement(By.xpath("//ul/li[@data-value='ind']"));
		a1.moveToElement(countryName).click().build().perform();
		
		WebElement streetAdd = driver.findElement(By.id("street_address"));
		streetAdd.sendKeys("Test address");
		
		WebElement postCode = driver.findElement(By.id("postcode"));
		postCode.sendKeys("012345");
		
		WebElement townCity = driver.findElement(By.id("city"));
		townCity.sendKeys("Test City");
		
		WebElement province = driver.findElement(By.id("state"));
		province.sendKeys("Test State");
		
		WebElement phone = driver.findElement(By.id("phone_number"));
		phone.sendKeys("0123456789");
		
		WebElement email = driver.findElement(By.id("email_address"));
		email.sendKeys("testemail@email.com");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//label[@for='customCheck1']"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.xpath("//label[@for='customCheck2']"));
		checkbox2.click();
		
		WebElement checkbox3 = driver.findElement(By.xpath("//label[@for='customCheck3']"));
		checkbox3.click();
		
		WebElement cod = driver.findElement(By.xpath("//a[@href='#collapseTwo']"));
		cod.click();
		
	}

	@And("the user clicks on Place Order")
	public void the_user_clicks_on_place_order() {
		driver.findElement(By.xpath("(//a[contains(@class,'essence-btn')])[2]")).click();
	}

	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {
		
	}

}
