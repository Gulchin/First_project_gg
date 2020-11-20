import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First_test {
    ChromeDriver driver;
@BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
@Test
    public void testOpenGoogle(){
    System.out.println("browser open");
    String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals(currentUrl,"https://www.google.com/");
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("webdriver"+ Keys.ENTER);


}

@AfterMethod(enabled = false)
    public void tearDown(){
    driver.quit();

}
}
