package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class ProjectModule extends BaseClass {
	
	@Test
	public void testCreateProject() throws InterruptedException, EncryptedDocumentException, IOException  {
		
		FileLib f=new FileLib();
		String expProjectName = f.getExcelData("CreateCoustomer", 1, 4);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskButton();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewProject().click();
		t.getEnterProjectName().sendKeys(expProjectName);
		t.getCustomerDropdown().click();
		t.getSelectCustomer().click();
		t.getProjectDiscription().sendKeys(f.getExcelData("CreateCoustomer", 1, 5));
		t.getCreateProjectBtn().click();
		Thread.sleep(5000);
		String actualProjectName = t.getVerifyProjectName().getText();
		Assert.assertEquals(actualProjectName, expProjectName);
	
	}

}
