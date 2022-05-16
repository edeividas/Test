package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import Pages.LoginPage;

public class LoginOut extends TestParameters {
	
	@Test
	public void Logout() throws Exception {
	
	  LoginPage lg = new LoginPage(driver);
	   
	  lg.LogOut();
	  
	  takeSnapShot(driver);
	  
	  String alertMessage = driver.findElement(By.xpath("/html/body/div/form/div/span[1]")).getText();
	  
	  resultsToFile("Testas LoginOut  - Sëkmingai atsijungëte!","C:\\Users\\kater\\Desktop\\bandymas\\Bandymas\\src\\main\\resources\\results.txt");
	  
	  
	  assertEquals("Sëkmingai atsijungëte",alertMessage);
	   
	}
	
	
	
}