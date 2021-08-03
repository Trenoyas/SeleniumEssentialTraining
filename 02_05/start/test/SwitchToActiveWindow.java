import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\TESTS_PROJETS_FORMATIONS\\SELENIUM_DRIVERS\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement buttonAlert = driver.findElement(By.id("alert-button"));
        buttonAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);
        WebElement buttonNewtabbutton = driver.findElement(By.id("new-tab-button"));
        buttonNewtabbutton.click();

        String originalHandle = driver.getWindowHandle();
        //for (String handle1: driver.getWindowHandles()) {
        //    driver.switchTo().window(handle1);
        //}

        Thread.sleep(3000);
        driver.switchTo().window(originalHandle);


        //driver.quit();
    }
}
