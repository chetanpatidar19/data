package log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class myBooking {
	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.findElement(By.xpath("//*[@id=\"myBooking\"]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("7974230143");
		driver.findElement(By.xpath("//*[@id=\"login-signup-form-login-radio-password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"login-signup-form__password-input\"]")).sendKeys("112233");
		driver.findElement(By.xpath("//*[@id=\"signUpSubmit\"]")).click();
	}
	

}
