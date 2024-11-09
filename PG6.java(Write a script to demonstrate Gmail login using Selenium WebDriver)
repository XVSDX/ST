package Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class pg6 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://gmail.com/");

String expectedTitle="Gmail";
String actualTitle=driver.getTitle();
System.out.println(actualTitle);
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Thread.sleep(5000);
if(actualTitle.equals(expectedTitle))
{
System.out.println("Title is matching");
}
else {
System.out.println("Title is not matching");
}
driver.findElement(By.id("identifierId")).sendKeys("venkateshdalvi@rlsbca.edu.in");
driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='Passwd']")));

driver.findElement(By.cssSelector("input[name='Passwd']")).sendKeys("rlsbca@1234");
driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
Thread.sleep(3000);
System.out.println("Gmail login successful");
driver.close();
}
}
