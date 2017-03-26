import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class example1 {

	public static void main(String arg[])
	{
		//year we want to check
        int year = 2008;
       
        //if year is divisible by 4, it is a leap year
       
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                System.out.println("Year " + year + " is a leap year");
        else
                System.out.println("Year " + year + " is not a leap year");
	}
}
