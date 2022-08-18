import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class toggle {

        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://codepen.io/fidabrj/pen/NWYeaqG");
            

            WebElement toggle1 = driver.findElement(By.xpath("/html/body/ul/li[1]/input"));
            toggle1.click();
            /*WebElement ToggleButton = driver.findElement(By.id("#cb1"));
            ToggleButton.click();*/



        }
    }

