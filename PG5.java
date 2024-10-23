package Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class pg5 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
String sampleText=driver.findElement(By.id("idOfDiv")).getText();

System.out.println(sampleText);
Thread.sleep(3000);
driver.findElement(By.linkText("This is a link")).click();
driver.navigate().back();
driver.findElement(By.name("firstName")).sendKeys("Hi");
driver.findElement(By.name("firstName")).clear();
driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("#female")).click();
driver.findElement(By.className("Automation")).click();
Thread.sleep(3000);
WebElement image=driver.findElement(By.tagName("img"));
System.out.println(image.getAttribute("alt"));
driver.findElement(By.partialLinkText("Tutorial")).click();

driver.quit();
}
}
