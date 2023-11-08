package Qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		driver.findElement(By.id("selectBuild")).click();
		WebElement firstNumber=driver.findElement(By.id("number1Field"));
		WebElement secondNumber=driver.findElement(By.id("number2Field"));
		firstNumber.sendKeys("12");
		secondNumber.sendKeys("34");
		Select operationDropdown=new Select(driver.findElement(By.id("selectOperationDropdown")));
		operationDropdown.selectByVisibleText("Add");
		driver.findElement(By.id("calculateButton")).click();
		String result=driver.findElement(By.id("numberAnswerField")).getText();
		String expectedResult="46";
		if(result.equals(expectedResult))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
		
		}

}
