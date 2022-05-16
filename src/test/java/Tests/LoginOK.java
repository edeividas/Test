package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import Pages.LoginPage;

public class LoginOK extends TestParameters {
	
	@Test
	public void Login() throws Exception {
	
	  LoginPage lg = new LoginPage(driver);
	   
	  lg.LoginOK();
	//  takeSnapShot(driver);
	  
	  String alertMessage = driver.findElement(By.partialLinkText("Logout, laba")).getText();
	  
	  resultsToFile("Testas LoginOK  - Prisijungimas sekmingas!","C:\\Users\\kater\\Desktop\\bandymas\\Bandymas\\src\\main\\resources\\results.txt");
	//  assertEquals("Logout, laba",alertMessage);
	   
	}
	
	@Test
	public void LoginF() throws Exception {
	
	  LoginPage lg = new LoginPage(driver);
	   
	  lg.LoginF();
	//  takeSnapShot(driver);
	  Thread.sleep(1000);
	  String alertMessage = driver.findElement(By.xpath("/html/body/div/form/div/span[2]")).getText();
	  
	  resultsToFile("Testas LoginF  - Klaida! - "+alertMessage,"C:\\Users\\kater\\Desktop\\bandymas\\Bandymas\\src\\main\\resources\\results.txt");
	  assertEquals("Prisijungimas pavyko!",alertMessage);
	   
	}
	
}