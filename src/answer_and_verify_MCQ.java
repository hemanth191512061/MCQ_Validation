import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class answer_and_verify_MCQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chinni\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		web.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		/*Here I have taken rahulshetty automation practice web page to write the code*/
		/*for answering the mcq question I clicked the radio button*/
		WebElement selectingOption =web.findElement(By.xpath("//div[@id='radio-btn-example']//label[1]//input[1]"));
		selectingOption.click();
		
		/*for validating the option which is correct or not by isSelected method which returns boolean value*/
		/*In three options if correct answer is selected then it return true value else false*/
		/*Here i took option 2 is correct so i checked option 2 is selected or not 
		 * if it is selected then it displays true else false*/ 
		WebElement validationOfOption=web.findElement(By.xpath("//div[@id='radio-btn-example']//label[2]//input"));
		System.out.println(validationOfOption.isSelected());
        

	}

}
