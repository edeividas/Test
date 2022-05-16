package Tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestParameters {

	protected  WebDriver driver;
	
	@BeforeMethod
	public  void SetUp() {
		driver = new FirefoxDriver();
		
		}
	
	@AfterTest
	public void TearDown() {
	//	driver.manage().deleteAllCookies();
		driver.close();
		}
	
	 public static List<String> getTestDataList(String filePath) throws IOException {
			List<String> records = new ArrayList<String>(); 
			String record;
			
			FileReader FR = new FileReader(filePath);
			  BufferedReader BR = new BufferedReader(FR);
			  
			  //Loop to read all lines one by one from file and print It.
			  while((record = BR.readLine())!= null){
			   records.add(record);
				  System.out.println(record);
		}
			  BR.close();
			  return records;
	}
	
	 public static void takeSnapShot(WebDriver webdriver) throws Exception{

	      //Convert web driver object to TakeScreenshot
	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	      //Call getScreenshotAs method to create image file
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
          //Move image file to new destination
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
          	String filePath = "C:\\Users\\kater\\Desktop\\bandymas\\Bandymas\\src\\main\\resources\\"+timeStamp+".png";
            File DestFile=new File(filePath);
          //Copy file at destination
            FileUtils.copyFile(SrcFile, DestFile);
	    }
	 
	 public static ArrayList<String> getTestDataArray(String myFile) throws NumberFormatException, IOException {
			// for reading the file
			  // reading text file into ArrayList in Java 6
			  ArrayList<String> listOfLines = new ArrayList<String>();
			  String line;
			  
			  FileReader FR = new FileReader(myFile);
			  BufferedReader BR = new BufferedReader(FR);
			  line = BR.readLine();
		  
		    
		    while (line != null) {
		      listOfLines.add(line);
		      line = BR.readLine();
		    }

		    BR.close();
		    System.out.println("Content of ArrayLiList:");
		    System.out.println(listOfLines);

			return listOfLines;
			
		}
	 
	 public static void resultsToFile(String text, String fileName) throws IOException {
		 FileWriter fw = new FileWriter(fileName, true);//open file to write info
		 BufferedWriter bw = new BufferedWriter(fw);//teksto rasymui
		 PrintWriter pw = new PrintWriter(bw);//kaskart irasineti atskiroje eiluteje.
		 pw.println(text);
		 pw.close();//uzdarome irasinejimo faila.}
	 }
	 
	 } 
