import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\TESTS_PROJETS_FORMATIONS\\SELENIUM_DRIVERS\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement inputAddress = driver.findElement(By.id("autocomplete"));
        inputAddress.sendKeys("16 Allée des Lilas, Fondettes, France");
        Thread.sleep(10000);
        WebElement divAuto = driver.findElement(By.className("pac-item"));
        divAuto.click();

        driver.quit();
    }
}
