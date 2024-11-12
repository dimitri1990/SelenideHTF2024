package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class TransmissionPage {

    private final SelenideElement goToTransMissionBtn = $(By.id("action-button"));

    public void clickOnTransMissionButton(){
        goToTransMissionBtn.should(Condition.visible,Duration.ofSeconds(5)).click();
    }
}
