package test.mm.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.mm.tests.ValueBalanceTest;

public class GivenThenStatements {

	ValueBalanceTest vbTestObj=new ValueBalanceTest();

	@Given("^I navigate to the url \"([^\"]*)\"")
	public void driverInitAndNav(String url){
		vbTestObj.driverInitAndNav(url);
		
	}
	
	@Then("^I verify whether right count of values appear on the page$")
	public void verifyRightCountOfValuesFromUI(){
		vbTestObj.verifyRightCountOfValuesFromUI();
		
	}
	
	@Then("^I verify values from the page are greaterthan zero$")
	public void valuesFromUIGreaterThanZero(){
	     vbTestObj.valuesFromUIGreaterThanZero();
		
	}
	
	@Then("^I verify if the values are formatted as currencies$")
	public void valuesFromUIFormattedAsCurrencies(){
		vbTestObj.valuesFromUICurrencies();
		
	}
	
	@Then("^I verify if the total balance is equal to sum of all the values$")
	public void verifyTotalBalanceIsSumOfValues(){
		vbTestObj.verifyTotalBalance();
		
	}
}

