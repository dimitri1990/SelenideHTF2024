import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BrowserTest {


    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\opt\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
    }

    @BeforeEach
    public void openWebsite(){
        Selenide.open("https://hackthefuture.bignited.be");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }




}
