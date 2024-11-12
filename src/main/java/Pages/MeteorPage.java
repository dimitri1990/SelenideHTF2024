package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MeteorPage {

    private final SelenideElement meteor = $(By.xpath("//div[@class='floating-cube']"));


    public void clickOnMeteor(){
        meteor.should(Condition.visible, Duration.ofSeconds(50));
        meteor.click();
    }

    public void clickAndHoldScanButton(){
        Selenide.actions()
                .moveToElement($(By.xpath("//button[contains(text(),'Press to scan')]")))
                .clickAndHold().pause(10000).release().build().perform();
    }


}
