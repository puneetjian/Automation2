package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class example1Test {

  @Test()
  public void test1() {
	  System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		
	  HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	    driver.close();
  }
  
  @Test()
  public void test3() {
	  System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		
	  /*String condition="Skip";
	  if(condition.equals("Skip"))
	  {
		  
		  throw new SkipException("yest");
	  }*/
		
	  HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://zeenews.com");
		System.out.println(driver.getTitle());
	    driver.close();
  }
  
 // @Test(description="test is a process of testing defect")
  @Test(dataProvider="test")
  public void loginTest(String Uid, String Pwd){
		System.out.println("UserName is "+ Uid);
		System.out.println("Password is "+ Pwd);
	}
	
  @DataProvider(name="test")
  public Object [][] getData(){
	  Object [][] data = new Object [2][2];
		
		data [0][0] = "FirstUid";
		data [0][1] = "FirstPWD";
		
		data[1][0] = "SecondUid";
		data[1][1] = "SecondPWD";
		return data;
	  
	  
	  
  }
}
