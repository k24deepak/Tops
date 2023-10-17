package TOPS.Athlete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TOPS.TestComponents.BaseTest;

public class Login_Athlete extends BaseTest {
		
	@Test
	public void atheleteLogin() throws InterruptedException {

		
		driver.get("http://192.168.23.254:1010/#/login?appId=RVq6Hi700P");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ARAA339M05");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Sai@12345");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='website-submit-btn']")).click();
		driver.findElement(By.cssSelector(".website-submit-btn.green-success-btn")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/mat-form-field[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-option-10")).click();
		driver.findElement(By.cssSelector("mat-label[class='ng-tns-c12-13']")).click();
		
		List<WebElement> dates = driver
				.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted"));
		// Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted"))
					.get(i).getText();
			if (text.equalsIgnoreCase("15")) {
				driver.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted")).get(i)
						.click();
				break;
			}

		}

		driver.findElement(By.cssSelector("input[formcontrolname='to_Date']")).click();
		List<WebElement> TOdates = driver
				.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted"));
		// Grab common attribute//Put into list and iterate
		int count1 = driver.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted"))
					.get(i).getText();
			if (text.equalsIgnoreCase("25")) {
				driver.findElements(By.cssSelector(".mat-calendar-body-cell-container.ng-star-inserted")).get(i)
						.click();
				break;
			}

		}

		driver.findElement(By.id("mat-select-value-7")).click();
		driver.findElement(By.id("mat-option-13")).click();
		driver.findElement(By.id("mat-select-value-9")).click();
		driver.findElement(By.id("mat-option-15")).click();
		driver.findElement(By.id("mat-input-6")).sendKeys("Testing");
		driver.findElement(By.id("mat-input-7")).sendKeys("Testing");
		driver.findElement(By.id("mat-input-8")).sendKeys("Testing");
		driver.findElement(By.id("mat-input-9")).sendKeys("Testing");
		driver.findElement(By.id("mat-select-10")).click();
		driver.findElement(By.id("mat-option-17")).click();
		driver.findElement(By.id("mat-input-10")).sendKeys("Testing");
		// driver.findElement(By.cssSelector(".mdc-switch__ripple")).click();
		driver.findElement(By.id("mat-input-11")).sendKeys("Testing");
		driver.findElement(By.id("mat-input-12")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();

		
	}

}
