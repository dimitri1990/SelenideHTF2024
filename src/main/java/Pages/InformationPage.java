package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class InformationPage {

    private final SelenideElement nameInput = $(By.id("name"));
    private final SelenideElement ageInput =  $(By.id("age"));
    private final SelenideElement speciesDropdown = $(By.id("species"));
    private final SelenideElement planetInput = $(By.id("planet"));


    public void fillInTheInformationForm(String name, int age, String specicies, String planet){
        nameInput.should(Condition.visible, Duration.ofSeconds(50));
        nameInput.val(name);
        ageInput.val(Integer.toString(age));
        speciesDropdown.selectOptionContainingText(specicies);
        planetInput.val(planet);
        planetInput.pressEnter();
    }



}
