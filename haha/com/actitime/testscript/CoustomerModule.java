package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CoustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException{
		FileLib f=new FileLib();
		 String expCustomerName = f.getExcelData("CreateCoustomer", 1, 2);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskButton();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCoustomer().click();
		t.getCustNameTbx().sendKeys(expCustomerName);
		t.getCustDiscrArea().sendKeys(f.getExcelData("CreateCoustomer", 1, 3));
		t.getSelCust().click();
		t.getBigBang().click();
		t.getCreateCustBtn().click();
		Thread.sleep(5000);
		String autCustomerName = t.getVerifyCustName().getText();
		Assert.assertEquals(autCustomerName, expCustomerName);
		
		
	}
	
	

	

}
