Checkbox.html
<html>
<body>
<h2>Choose your Hobbies</h2>
<input type="checkbox" name="hobby" value="Reading"> Reading<br>
<input type="checkbox" name="hobby" value="Swiming"> Swiming<br>
<input type="checkbox" name="hobby" value="Travelling"> Travelling<br>
<input type="checkbox" name="hobby" value="Hiking"> Hiking<br>
<input type="checkbox" name="hobby" value="Dancing"> Dancing<br>
<br><br>
</body>
</html>


package Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class pg12 {
public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();
driver.get("D://Checkbox.html");

driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/input[1]")).click();
driver.findElement(By.xpath("/html/body/input[3]")).click();

List <WebElement> checkBox =

driver.findElements(By.xpath("//input[@type='checkbox']"));

int checkedCount = 0;
int uncheckedCount = 0;
for (int i=0;i<checkBox.size();i++)
{
if ( checkBox.get(i).isSelected() == true)
checkedCount++;
else
uncheckedCount++;
}
System.out.println("Number of checked checkboxes are " +checkedCount);
System.out.println("Number of unchecked checkboxes are " +

uncheckedCount);

driver.close();
}

}

  
