package Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class pg11 {
public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://nwkrtc.karnataka.gov.in");
driver.findElement(By.cssSelector("body > main:nth-child(8) > form:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > button:nth-child(1)")).click();
Thread.sleep(2000);
Alert simpleAlert = driver.switchTo().alert();
String alertMessage= driver.switchTo().alert().getText();
System.out.println(alertMessage);
simpleAlert.accept();
Thread.sleep(5000);
driver.close();
}
}
