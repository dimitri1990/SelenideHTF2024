package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class GatePage {

    private final SelenideElement smallNumpadImg = $(By.id("numpad"));
    private final SelenideElement largeNumpad = $(By.id("numpad-large"));




    public void clickOnNumpadToEnlargeIt(){
        smallNumpadImg.should(Condition.visible,Duration.ofSeconds(30));
        smallNumpadImg.click();
    }

    public void FillInTheCode(List<Integer> codeSplit){
        largeNumpad.should(Condition.visible,Duration.ofSeconds(30));

        for (Integer integer : codeSplit) {
            sleep(500);
            $(By.id(String.valueOf(integer))).click();
    }
        $(By.id("enter")).click();
    }

    public void enterTheDarkByPressingArrowUp(){
        $(By.id("back-button")).should(Condition.visible, Duration.ofSeconds(50));
        Selenide.actions().sendKeys(Keys.ARROW_UP).perform();
    }
}
