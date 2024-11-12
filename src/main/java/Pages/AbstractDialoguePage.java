package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class AbstractDialoguePage {

    private final SelenideElement continueButton = $(By.id("continue"));

    public void clickOnContinue(){
        continueButton.should(Condition.visible,Duration.ofSeconds(50));
        continueButton.click();
    }
}
