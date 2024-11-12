package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class DeadBodyPage {

    private final SelenideElement bodyImage = $(By.xpath("//img"));
    private final SelenideElement continueBtn = $(By.className("ski-button"));


    public void clickOnTheYellowPaper(){
        bodyImage.should(Condition.visible, Duration.ofSeconds(50));
        Selenide.actions().moveToElement(bodyImage, 24, 78).click().build().perform();
    }

    public List<Integer> saveTheCodeShownOnScreen(){
        SelenideElement codeOnScreen = $(By.className("murder")).should(Condition.visible,Duration.ofSeconds(30));
        String code = codeOnScreen.text();
        List<Integer> codeSplit = code.chars().map(Character::getNumericValue).boxed().toList();
        codeOnScreen.click();
        return codeSplit;
    }

    public void clickOnContinueButton(){
        continueBtn.should(Condition.visible, Duration.ofSeconds(50)).click();
    }
}
