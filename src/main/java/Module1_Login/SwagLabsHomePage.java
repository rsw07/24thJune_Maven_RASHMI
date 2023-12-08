//POM Class-2

package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{
	WebDriver driver;    //global variable declaration
	
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement ViewBtn;
	
	public SwagLabsHomePage(WebDriver driver)
	{
		this.driver = driver;     //this.globalvariable = localvariable
		PageFactory.initElements(driver, this);
	}
	
	public String getSwagLabsHomePageTitle()
	{
		String ActTitle = driver.getTitle();
		return ActTitle;
	}
	
	public void ClickSwagLabsHomePageViewBtn()
	{
		ViewBtn.click();
	}

}
