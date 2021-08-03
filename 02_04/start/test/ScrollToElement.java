import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\TESTS_PROJETS_FORMATIONS\\SELENIUM_DRIVERS\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement inputName=driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);

        actions.moveToElement(inputName);

        inputName.sendKeys("remi");

        WebElement inputDate=driver.findElement(By.id("date"));
        inputDate.sendKeys("02/03/1974");

        driver.quit();
    }
}
