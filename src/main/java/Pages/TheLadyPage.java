package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class TheLadyPage {

    private final SelenideElement headerH1 = $(By.tagName("H1"));

    public void clickYesOrNoOnHelpQuestion(String answer) {
        headerH1.should(Condition.text("Are you here to help?"), Duration.ofSeconds(50));
        $(By.xpath("//button[contains(text(),'" + answer + "')]")).should(Condition.visible, Duration.ofSeconds(30));
        javaScriptClick( $(By.xpath("//button[contains(text(),'" + answer + "')]")));
    }

    public void clickOnYesOrNoOnLieQuestion(String answer){
        $(By.xpath("//p[contains(text(),'Are you really gonna tell a lie? ')]//button[contains(text(),'"+answer+"')]")).click();
    }

    public void clickOnArrowOnWhatHappend(){
        headerH1.should(Condition.text("I'll tell you what happened"),Duration.ofSeconds(50));
        javaScriptClick($(By.xpath("//button")));
    }

    public void clickOnArrowOnExperimentWentWrong(){
        headerH1.should(Condition.text("An experiment went wrong here. Some kind of reaction changed the DNA of our animal experiment...")
                ,Duration.ofSeconds(50));
        $(By.xpath("//button")).should(Condition.visible,Duration.ofSeconds(30));
        javaScriptClick($(By.xpath("//button")));
    }

    public void clickOnArrowOnMeteorText(){
        headerH1.should(Condition.text("You have to scan the meteor that created the reaction, maybe we can find a solution this way")
                ,Duration.ofSeconds(50));

        javaScriptClick($(By.xpath("//button")));
    }

    private void javaScriptClick(SelenideElement elementToClickOn) {
        JavascriptExecutor executor = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        executor.executeScript("arguments[0].click();", elementToClickOn);
    }












}
