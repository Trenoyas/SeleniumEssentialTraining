import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\TESTS_PROJETS_FORMATIONS\\SELENIUM_DRIVERS\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement butOpenModal = driver.findElement(By.id("modal-button"));
        butOpenModal.click();

        Thread.sleep(3000);
        WebElement butClose = driver.findElement(By.id("close-button"));
        //methode1: quand ça fonctionne
        //butClose.click();
        //methode2:  Javascript
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",butClose);


        //driver.quit();
    }
}
