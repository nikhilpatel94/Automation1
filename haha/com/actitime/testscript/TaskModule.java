package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;


public class TaskModule extends BaseClass{
	@Test
	public void testCreateTask() throws EncryptedDocumentException, IOException, InterruptedException {
		
	FileLib f=new FileLib();
EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
e.setTaskButton();
TaskListPage t=new TaskListPage(driver);
t.getAddNewBtn().click();
t.getNewTaskBtn().click();
Select s=new Select(t.getCreatedCustomerdropdowninTask());
s.selectByVisibleText("Nikhil_001");
Select s1=new Select(t.getCreatedProjectdropdowninTask());
s1.selectByVisibleText("Nikhil project");
//t.getCreatedCustomerdropdowninTask().click();
//t.getCreatedCustomerinTask().click();
//t.getCreatedProjectdropdowninTask().click();
//t.getCreatedProjectinTask().click();
t.getTaskNameTbx().sendKeys(f.getExcelData("CreateCoustomer", 1, 6));
t.getCreatenewTaskBtn().click();
Thread.sleep(5000);
//t.getVerifyTaskName();
	}
}
