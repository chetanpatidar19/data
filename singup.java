package log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class singup {
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("9617005912");
		driver.findElement(By.xpath("//*[@id=\"login-signup-form__name-input\"]")).sendKeys("chetan");
		driver.findElement(By.xpath("//*[@id=\"login-signup-form__email-input\"]")).sendKeys("chetan.patidar@mindtree.com");
		driver.findElement(By.xpath("//*[@id=\"signUpSubmit\"]")).click();
		driver.close();
}
}