package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser(){
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@BeforeMethod
	public void login() throws IOException {
		FileLib f= new FileLib();
		driver.get(f.getPropertyData("url"));
		String un = f.getPropertyData("username");
		String pw=f.getPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.setlogin(un, pw);
	}
	
    @AfterMethod
    public  void logout() {
    	EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
    	e.setLogout();
    }
    
   @AfterTest
   public void closeBrowser(){
	   driver.quit();
	   
   }
   
}
