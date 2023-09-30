package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCoustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement custNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustDiscrArea;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selCust;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBang;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement verifyCustName;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement customerDropdown;
	
    @FindBy(xpath="//div[text()='Nikhil_001' and @class='itemRow cpItemRow ']")	
    private WebElement SelectCustomer;
    
    @FindBy(xpath="//textarea[@placeholder='Add Project Description']")
    private WebElement projectDiscription;
    
    @FindBy(xpath="//div[text()='Create Project']")
    private WebElement createProjectBtn;
	
    @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
    private WebElement verifyProjectName;
    
    @FindBy(xpath="//div[text()='+ New Tasks']")
    private WebElement newTaskBtn;
    
    @FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")
    private WebElement createdCustomerdropdowninTask;
    
    @FindBy(xpath="//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']")
    private WebElement CreatedProjectdropdowninTask;
    
    @FindBy(xpath="//div[text()='Nikhil_001']")
    private WebElement createdCustomerinTask;
    
    @FindBy(xpath="//div[text()='Nikhil project']")
    private WebElement CreatedProjectinTask;
    
    @FindBy(xpath="(//td[@class='nameCell first'])[4]")
    private WebElement taskNameTbx;
    
    @FindBy(xpath="//div[text()='Create Tasks']")
    private WebElement createnewTaskBtn;
    
    @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
    private WebElement verifyTaskName;
    
    
    
    
	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}


	public WebElement getCreatedCustomerdropdowninTask() {
		return createdCustomerdropdowninTask;
	}


	public WebElement getCreatedProjectdropdowninTask() {
		return CreatedProjectdropdowninTask;
	}


	public WebElement getCreatedCustomerinTask() {
		return createdCustomerinTask;
	}


	public WebElement getCreatedProjectinTask() {
		return CreatedProjectinTask;
	}


	public WebElement getTaskNameTbx() {
		return taskNameTbx;
	}


	public WebElement getCreatenewTaskBtn() {
		return createnewTaskBtn;
	}


	public WebElement getVerifyTaskName() {
		return verifyTaskName;
	}


	public WebElement getVerifyProjectName() {
		return verifyProjectName;
	}


	public WebElement getNewProject() {
		return newProject;
	}


	public WebElement getEnterProjectName() {
		return enterProjectName;
	}


	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}


	public WebElement getSelectCustomer() {
		return SelectCustomer;
	}


	public WebElement getProjectDiscription() {
		return projectDiscription;
	}


	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}


	public WebElement getVerifyCustName() {
		return verifyCustName;
	}


	public TaskListPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getAddNewBtn() {
		return addNewBtn;
	}


	public WebElement getNewCoustomer() {
		return newCoustomer;
	}


	public WebElement getCustNameTbx() {
		return custNameTbx;
	}


	public WebElement getCustDiscrArea() {
		return CustDiscrArea;
	}


	public WebElement getSelCust() {
		return selCust;
	}


	public WebElement getBigBang() {
		return bigBang;
	}


	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	
	

}
