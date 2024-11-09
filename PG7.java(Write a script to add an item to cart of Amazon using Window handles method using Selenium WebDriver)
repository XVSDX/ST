package Test;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class pg7 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));

searchbox.sendKeys("iphone 14");
searchbox.submit();

driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

// store window ids in array list
ArrayList<String> wid = new
ArrayList<String>(driver.getWindowHandles());

//switch to active tab
driver.switchTo().window(wid.get(1));
driver.findElement(By.id("buy-now-button")).click();
Thread.sleep(3000);
System.out.println("Thank You for Shopping");
driver.quit();
}
}
