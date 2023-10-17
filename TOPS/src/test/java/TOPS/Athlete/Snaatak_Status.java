package TOPS.Athlete;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TOPS.TestComponents.BaseTest;

public class Snaatak_Status extends BaseTest {

	@Test
	public void statusCheck() throws InterruptedException {

		driver.get("https://medhasoft.bih.nic.in/mkuysnatak2021/pms/CheckStatus.aspx");
		WebElement selectCategory = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlUniversity"));
		Select Category = new Select(selectCategory);
		Category.selectByVisibleText("Lalit Narayan Mithila University, Darbhanga");

		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtRegNo")).sendKeys("19310081554");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobile")).sendKeys("9153375688");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnGet")).click();
		System.out.println(
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_gv_Status_ctl02_lblFinalStatus")).getText());
		Assert.assertEquals(
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_gv_Status_ctl02_lblFinalStatus")).getText(),
				"Waitng For Payment");

	}
}
