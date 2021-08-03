import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\TESTS_PROJETS_FORMATIONS\\SELENIUM_DRIVERS\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement inputFN = driver.findElement(By.id("name"));
        inputFN.click();
        inputFN.sendKeys("remi yang");

        WebElement buttonConnexion = driver.findElement(By.id("button"));
        buttonConnexion.click();

        driver.quit();
    }
}
