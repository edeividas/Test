package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{
	
	       //locators
	
	
	By createNewAcc  = By.partialLinkText("Sukurti naujà paskyrà");
	By usernameInput = By.className("form-control");
	By passwordInput = By.id("password");
	By passwordInputConfirm = By.id("passwordConfirm");
	By createButton = By.xpath("/html/body/div/form/button");
	By usernameError = By.id("username.errors");
	By inputLogin = By.xpath("/html/body/div/form/div/input[1]");
	By inputPassword  = By.xpath("/html/body/div/form/div/input[2]");
	By loginButton = By.xpath("/html/body/div/form/div/button");
	By logOutLink = By.partialLinkText("Logout, laba");
	
	
	      //constructor
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}  
	
	     //methods
	
	
	public void CreateNewAcc() throws InterruptedException {
		
		driver.navigate().to("localhost:8080");
		driver.findElement(createNewAcc).click();
	//	driver.findElement(usernameInput).clear();
		driver.findElement(usernameInput).sendKeys("laba11");
	//	driver.findElement(usernameInput).clear();
		driver.findElement(passwordInput).sendKeys("diena15");
	//	driver.findElement(usernameInput).clear();
		//Thread.sleep(2000);
		driver.findElement(passwordInputConfirm).sendKeys("diena15");
		driver.findElement(createButton).click();
		
	}
	
	
	public void CreateNewAccF() {
		
		driver.navigate().to("localhost:8080");
		driver.findElement(createNewAcc).click();
		driver.findElement(usernameInput).sendKeys("laba11");
		driver.findElement(passwordInput).sendKeys("diena12");
		driver.findElement(passwordInputConfirm).sendKeys("diena12");
		driver.findElement(createButton).click();
		String alertMessage = driver.findElement(By.id("username.errors")).getText();
		System.out.println(alertMessage);
		
		
	}
	
	
	public void LoginOK() {
		
		driver.navigate().to("localhost:8080");
		
		driver.findElement(inputLogin).sendKeys("laba");
		
		driver.findElement(inputPassword).sendKeys("diena");
		driver.findElement(loginButton).click();
		
		
	}
	
	public void LoginF() {
		
        driver.navigate().to("localhost:8080");
		driver.findElement(inputLogin).sendKeys("laba");
		driver.findElement(inputPassword).sendKeys("0");
		driver.findElement(loginButton).click();
		
	}

	
	public void LogOut() {
		
        driver.navigate().to("localhost:8080");
		driver.findElement(inputLogin).sendKeys("laba");
		driver.findElement(inputPassword).sendKeys("diena");
		driver.findElement(loginButton).click();
		driver.findElement(logOutLink).click();
		
	}
	
}



