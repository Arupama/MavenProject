package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TaskStepDefinition 
{
	//Given an user opens browser and URL
	@Given("^an user opens browser and URL$")
	
		public void OpensBrowser()
		{
			WebDriver driver=new FirefoxDriver();
		}
	//When the user enters the UserName and password
	@When("^the user enters the UserName and password$")
	    
	  public void EnterDetails()
	  {
		System.out.println("Enter username and password");
	  }
	//And click login button
	@And("^click login button$")
	
	public void loginIn()
	{
		System.out.println("login");
	}
	//Then the login page should be displayed
	@Then ("^the login page should be displayed$")
	public void LogInDisplay()
	{
		System.out.println("logindisplay");
	}
   //When the user click on tasks tab
	@When("^ the user click on tasks tab$")
	
	public void Tab()
	{
		System.out.println("tab");
	}
	//Then the Tasks page should be displayed
	@Then("^ the Tasks page should be displayed$")
	public void TaskPageDisplay()
	{
		System.out.println("taskpagedisplay");
	}
	//When the user clicks on new add new button
	@When("^ the user clicks on new add new button$")
	public void AddNew()
	{
		System.out.println("addnew");
	}
	//Then the create customer PopUp should appear
	@Then("^the create customer PopUp should appear$")
	public void CustomerPopup()
	{
		System.out.println("customerpopup");
	}
	//When the user enters the customer name and description
	@When("^ the user enters the customer name and description$")
	public void CustNameDesc()
	{
		System.out.println("custnamedese");
	}
	//And click on create customer button
	@And("^click on create customer button$")
	public void CreateCustomerBtn()
	{
		System.out.println("createcustomerbtn");
	}
	//Then the customer should be created
	@Then("^ the customer should be created$")
	public void CustomerCreated()
	{
		System.out.println("customercreated");
	}

	
	
	
	
	
}
