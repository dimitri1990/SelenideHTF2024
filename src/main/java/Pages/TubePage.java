package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class TubePage {


    String[] current = $(By.id("current-reading")).text().split("");
    String[] wanted = $(By.id("wanted-reading")).text().split("");


    public void setBothValuesEqualAndContinue() {
        for (int i = 0; i < current.length; i++) {
            int number = i + 1;
            while (!current[i].equals(wanted[i]) && $(By.id("current-reading")).isDisplayed()) {

                if (Integer.parseInt(current[i]) < Integer.parseInt(wanted[i])) {
                    $(By.xpath("(//span[contains(text(),' keyboard_arrow_up')])[" + number + "]")).click();
                    sleep(1000);
                } else {
                    $(By.xpath("(//span[contains(text(),' keyboard_arrow_down')])[" + number + "]")).click();
                    sleep(1000);
                }

                if ($(By.id("current-reading")).isDisplayed()) {
                    current = $(By.id("current-reading")).text().split("");
                }
            }
        }
        $(By.tagName("body")).pressEnter();
    }

}
