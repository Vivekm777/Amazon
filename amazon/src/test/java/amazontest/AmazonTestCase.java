package amazontest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import automationcore.BaseClass;

public class AmazonTestCase extends BaseClass {
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void intialization(String browser)
	{
		driver= browserIntialization(browser);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		}
	
	/*@Test
	public void tc01() {
		/*
	    System.out.println("test case1");
		driver.navigate().to("https://www.amazon.in/s?bbn=81107432031&rh=n%3A81107432031%2Cp_85%3A10440599031&_encoding=UTF8&content-id=amzn1.sym.58c90a12-100b-4a2f-8e15-7c06f1abe2be&pd_rd_r=bb4bb6a4-b63c-4527-aaa7-792780de267b&pd_rd_w=UWlSF&pd_rd_wg=8XHnz&pf_rd_p=58c90a12-100b-4a2f-8e15-7c06f1abe2be&pf_rd_r=JCPN2VMKS8TEQWWKFPRS&ref=pd_hp_d_atf_unk");		
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    //driver.close();
	    //driver.quit();
	/*   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
	   driver.findElement(By.name("field-keywords")).clear();
	   driver.findElement(By.className("nav-input")).sendKeys("Samsung");
	   driver.findElement(By.name("field-keywords")).clear();
	   driver.findElement(By.name("field-keywords")).sendKeys("Smart tv");
	   driver.findElement(By.id("nav-search-submit-button")).click();
	   List<WebElement> products=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	   int productsize=products.size();
	   System.out.println(productsize);
	   //Right click by using action class
	   Actions action=new Actions(driver);
	   //action.contextClick().build().perform();
	   action.doubleClick(driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"))).build().perform();
	   String value1=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getText();
	   System.out.println(value1);
	   String value2=driver.findElement(By.xpath("//span[text()='Deals & Discounts']")).getTagName();
	   System.out.println(value2);
	   String value3=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name");
	   System.out.println(value3);
	   //driver.findElement(By.xpath("//div[@class='nav-search-field ']//child::input")).clear();
	   driver.findElement(By.xpath("(//span[@id='a-autoid-0']//descendant::span)[2]")).click();
	   driver.findElement(By.partialLinkText("Price")).click();
	   
	   //dropdown using select tag
	   driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	   WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
	   Select obj=new Select(dropdown);
	   obj.selectByValue("ANGOLA");
	   obj.selectByVisibleText("ARGENTINA");
	   */
	    
	   //drag and drop
	    /*
       driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
	   WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
	   WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
       Actions action1=new Actions(driver);
       action1.dragAndDrop(source, target).build().perform();
       //hover over an element-moveToElement()
       driver.navigate().to("https://www.amazon.in/");
       WebElement signIn=driver.findElement(By.xpath("(//div[@id='nav-tools']//descendant::a)[2]"));
       action1.moveToElement(signIn).build().perform();
       //isEnabled()
       boolean searchButtonstatus=driver.findElement(By.xpath("(//div[@class='nav-right'])[1]//descendant::span")).isEnabled();
       System.out.println(searchButtonstatus);
       //radio button
       driver.navigate().to("https://www.91mobiles.com/phonefinder.php");
       driver.findElement(By.id("latestandexpectprice101000001")).click();
       driver.findElement(By.id("latestandexpectprice1000002000001")).click();
       //checkbox
       driver.findElement(By.id("mobraminmb614401000000")).click();
       //isSelected()
       boolean checkBoxButtonStatus=driver.findElement(By.id("mobraminmb614401000000")).isSelected();
       System.out.println(checkBoxButtonStatus);
       //isDisplayed()
       boolean pricerangeboxverification=driver.findElement(By.xpath("//div[@class='refine_search_block_wrapper slider3 price_tag_finder new-finder-left']")).isDisplayed();
       System.out.println(pricerangeboxverification);
       //Alert Handling
        */
      /* driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
       driver.findElement(By.name("cusid")).sendKeys("123");
       driver.findElement(By.name("submit")).click();
       driver.switchTo().alert().accept();//accept the alert popup
       //driver.switchTo().alert().dismiss();//dismiss the alert popup
       
     }
     
	@Test
	public void tc02() throws InterruptedException {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[3]//descendant::span")));
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[3]//descendant::span")).click();
		String parent=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String>i1=s.iterator();
		while(i1.hasNext()) {
		String childWindow=i1.next();
		if(!parent.equals(childWindow)) {
			driver.switchTo().window(childWindow);
			driver.findElement(By.xpath("(//span[@id='submit.add-to-cart']//descendant::input)[2]")).click();
		}
		}
		driver.switchTo().window(parent);
		driver.navigate().refresh();
		
		
		/*driver.navigate().to("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		System.out.println("testcase2");
		driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bruno");
		driver.navigate().refresh();
        String age=driver.findElement(By.xpath("((//tr[@class='odd'])[4]//td)[4]")).getText();
        System.out.println(age);
        List<WebElement>data=driver.findElements(By.xpath("//tr[@class='odd' or @class='even']/td"));
		ArrayList<String>value1=new ArrayList<String>();
		for(int i=0;i<data.size();i++)
		{
		  value1.add(data.get(i).getText());
		}
		//System.out.println(value1);
		String name=value1.get(5);
	    System.out.println(name);
	    System.out.println(",,,,,,,,,");
	    System.out.println(value1);
	    ArrayList<String>value2=new ArrayList<String>();
	    value2.add("Airi Satou");
	    value2.add("Accountant");
	    value2.add("Tokyo");
	    value2.add("33");
	    value2.add("2008/11/28");
	    value2.add("$162,700");
	    value2.add("Angelica Ramos");
	    value2.add("Chief Executive Officer (CEO)");
	    value2.add("London");
	    value2.add("47");
	    value2.add("2009/10/09");
	    value2.add("$1,200,000");
	    value2.add("Ashton Cox");
	    value2.add("Junior Technical Author");
	    value2.add("San Francisco");
	    value2.add("66");
        value2.add("2009/01/12");
        value2.add("$86,000");
        value2.add("Bradley Greer");
        value2.add("Software Engineer");
        value2.add("London");
        value2.add("41");
        value2.add("2012/10/13");
        value2.add("$132,000");
        value2.add("Brenden Wagner");
        value2.add("Software Engineer");
        value2.add("San Francisco");
        value2.add("28");
        value2.add("2011/06/07");
        value2.add("$206,850");
        value2.add("Brielle Williamson");
        value2.add("Integration Specialist");
        value2.add("New York");
        value2.add("61");
        value2.add("2012/12/02");
        value2.add("$372,000");
        value2.add("Bruno Nash");
        value2.add("Software Engineer");
        value2.add("London");
        value2.add("38");
        value2.add("2011/05/03");
        value2.add("$163,500");
        value2.add("Caesar Vance");
        value2.add("Pre-Sales Support");
        value2.add("New York");
        value2.add("21");
        value2.add("2011/12/12");
        value2.add("$106,450");
        value2.add("Cara Stevens");
        value2.add("Sales Assistant");
        value2.add("New York");
        value2.add("46");
        value2.add("2011/12/06");
        value2.add("$145,600");
        value2.add("Cedric Kelly");
        value2.add("Senior Javascript Developer");
        value2.add("Edinburgh");
        value2.add("22");
        value2.add("2012/03/29");
        value2.add("$433,060");
        boolean compareValue=value1.equals(value2);
        System.out.println(compareValue);
	}  
	*/
  @Test(priority = 2)
  public void tc03()
  {
	SoftAssert softassert=new SoftAssert();  
	/*System.out.println("tc 03");
  
	driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.name("cusid")).sendKeys("123");
    driver.findElement(By.name("submit")).click();
    driver.switchTo().alert().accept();
    */
	//driver.navigate().to("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SmartTv");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	//To click on an element
	WebElement element=driver.findElement(By.id("nav-search-submit-button"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()",element);
	String custReview=driver.findElement(By.xpath("//span[text()='Customer Review']")).getText();
	softassert.assertEquals(custReview,"Customer Review" );
	String brandVerify=driver.findElement(By.xpath("//span[text()='Brands']")).getText();
	softassert.assertEquals(brandVerify, "Brands");
	
	
	//page Scrolling
	executor.executeScript("window.scrollBy(0,4000)"," ");
	softassert.assertAll();
  }
  
	@BeforeSuite
	public void beforeSuiteExample()
	{
		System.out.println("Beforesuite Example");
		
		
	}
	
	@AfterSuite
	public void afterSuiteExample()
	{
		
		System.out.println("AfterSuite Example");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("Before test example");
	}
  
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("After test example");
		
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Before Method");
		
		
		}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		
		System.out.println("Before Method");
		
	}
	
	
	@Test(dataProvider ="testData",priority =1)
	public void tc04(String value1,String value2 )
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("value-a")).sendKeys(value1);
		driver.findElement(By.id("value-b")).sendKeys(value2);
		driver.findElement(By.id("button-two")).click();
		
		
	}
	@DataProvider(name="testData")
	public Object[][] testDataFeed()
	{
	Object[][] dataSet=new Object[2][2];
	dataSet[0][0]="5";
	dataSet[0][1]="1";
	dataSet[1][0]="7";
	dataSet[1][1]="2";
	return dataSet;
			
		
	}
	
	@Test
	public void tc05() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");	
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement>products=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	int productsize=products.size();
	Assert.assertEquals(productsize, 23);
	}
		 
	
  }
	