import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lambdatest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.lambdatest.com/testuconf-2022/");

        WebElement toggle1 = driver.findElement(By.xpath("//html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/div/label"));
        toggle1.click();


    }

}
