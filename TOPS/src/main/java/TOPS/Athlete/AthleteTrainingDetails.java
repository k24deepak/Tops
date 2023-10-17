package TOPS.Athlete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TOPS.abstractcomponent.AbstractComponent;


public class AthleteTrainingDetails extends AbstractComponent {

	WebDriver driver;
	
	public AthleteTrainingDetails(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id = "userEmail")
	WebElement UserEmail;

	@FindBy(id = "userPassword")
	WebElement passwordELe;

	@FindBy(id = "login")
	WebElement submit;
	
	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage;

//	public ProductCatalogue loginApplication(String email, String password) {
//		UserEmail.sendKeys(email);
//		passwordELe.sendKeys(password);
//		submit.click();
//		ProductCatalogue productCatalogue =  new ProductCatalogue(driver);
//		return productCatalogue;
//	}

	public String getErrorMessage() {
		
		waitForwebElementToAppear(errorMessage);
		return errorMessage.getText();
	}
	
	public void goTo() {
		driver.get("http://192.168.23.254:1010/#/login?appId=RVq6Hi700P");
	}

}
