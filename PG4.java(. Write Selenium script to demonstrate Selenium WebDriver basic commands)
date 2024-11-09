package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class commands 
{
public static void main(String[] args) throws InterruptedException{
  
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
String title =driver.getTitle();
System.out.println(title);
Thread.sleep(1000);
WebElement t=driver.findElement(By.tagName("textarea"));
t.sendKeys("youtube");
t.submit();
driver.findElement(By.xpath("//h3[contains(text(),'YouTube')]")).click();
driver.navigate().refresh();
String url=driver.getCurrentUrl();
System.out.println(url);
driver.manage().window().fullscreen();
driver.navigate().back();
Dimension d=new Dimension(300,650);
driver.manage().window().setSize(d);
Thread.sleep(2000);
driver.close();
}
}
