package test.mm.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import test.mm.pages.ValuesBalancePageObjects;

public class ValueBalanceTest {

	//static String url="https://www.google.com";
	static String projectPath=System.getProperty("user.dir");
	static WebDriver driver;
	
	ValuesBalancePageObjects pagesObj = new ValuesBalancePageObjects();
	
	public static void driverInitAndNav(String url){
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	}	
	
	public List fetchUIValuesIntoList() {
		// TODO Auto-generated method stub
		
		List<Integer> valuesList=new ArrayList();
		try{
		List<WebElement> listOfValues=driver.findElements(By.xpath(pagesObj.balListFromUIXPATH));
			
		for (WebElement listValue: listOfValues){
			
			System.out.println(listValue);
			String va=listValue.getText();
			va.substring(1);
			int a=Integer.parseInt(va);
		    valuesList.add(a);
		    
		}
		}catch(Exception e){
			System.out.println("listOfValues web element is not found");
		}
		
		return valuesList;
	}
	
	public void verifyRightCountOfValuesFromUI() {
		try{
			
		List<WebElement> listOfValues=driver.findElements(By.xpath(pagesObj.valuesListFromUIXPATH));

		int valuesCount=listOfValues.size();
		List<Integer> listOfBalanceValues=fetchUIValuesIntoList();
		int balancevaluesCount=listOfBalanceValues.size();
		Assert.assertEquals("UI has right count of values", valuesCount, balancevaluesCount);
		}catch(Exception e){
			System.out.println("listOfValues web element is not found");
		}
		
	}
	public void valuesFromUICurrencies(){
				 
		try{
		List<WebElement> listOfValues=driver.findElements(By.xpath(pagesObj.balListFromUIXPATH));
		
		for (int i=0; i<listOfValues.size();i++){
			
			boolean currency= listOfValues.get(i).getAttribute("value").contains("$");
			System.out.println("UI Values are formatted as Currencies");
		    System.out.println("UI List value:" + listOfValues.get(i).getAttribute("value"));
		    Assert.assertTrue(currency);
			
		}
		}catch(Exception e){
			System.out.println("balListOfValues web element is not found");
		}
	}
	
	public void valuesFromUIGreaterThanZero(){
		
		try{
		List<WebElement> listOfValues=driver.findElements(By.xpath(pagesObj.balListFromUIXPATH));
		for (int i=0; i<listOfValues.size();i++){
			
		    System.out.println("List of UI values:" + listOfValues.get(i).getAttribute("value"));
		    
			String val= listOfValues.get(i).getAttribute("value").substring(1);
			
			int s = Integer.parseInt(val);
			Assert.assertEquals("Value is greaterthan 0", s>0, s);
			
		}
		}catch(Exception e){
			System.out.println("balListOfValues web element is not found");
		}
	
	}
	//to get sum of values in a list
	public static int sum(List<Integer> list) {
	    int sum = 0;
	    for (int i: list) {
	        sum += i;
	    }
	    return sum;
	}
	public void verifyTotalBalance(){
		
		int totBal;
		try{
		WebElement totBalUI=driver.findElement(By.id(pagesObj.totBalValueXPATH));
		String totBalFromUI=totBalUI.getText();
		totBalFromUI.substring(1);
		totBal=Integer.parseInt(totBalFromUI);
		List<Integer> list=fetchUIValuesIntoList();
		int sum=sum(list);
		Assert.assertEquals("Total Balance matches sum of the values from UI", sum, totBal);
		
		}catch(Exception e){
			System.out.println("totBalValue web element is not found");
		}
	}
	

}

