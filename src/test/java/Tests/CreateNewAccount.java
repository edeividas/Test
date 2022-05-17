package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import Pages.LoginPage;

public class CreateNewAccount extends TestParameters {
	
	@Test
	public void CreateNewAcc() throws Exception {
	
	  LoginPage lg = new LoginPage(driver);
	   
	  lg.CreateNewAcc();
	  takeSnapShot(driver);
	  
	 
	   
	}
	
	@Test
	public void CreateNewAccF() throws Exception {
	
	  LoginPage lg = new LoginPage(driver);
	   
	  lg.CreateNewAccF();
	  
	  String alertMessage = driver.findElement(By.id("username.errors")).getText();
	  resultsToFile("Testas CreateNewAccF  - Klaidos Praneðimas!:"+alertMessage,"C:\\Users\\kater\\eclipse-workspace\\Skaiciuotuvas_05.17\\src\\main\\resources\\results.txt");
	  assertEquals("Registered!",alertMessage);
	  
	 
	   }
	
}