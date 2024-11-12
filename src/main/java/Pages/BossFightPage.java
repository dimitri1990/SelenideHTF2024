package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import static com.codeborne.selenide.Selenide.$;

public class BossFightPage {

    private final SelenideElement boss = $(By.className("boss"));
    private final SelenideElement player = $(By.className("player"));

    public void movePlayerToBoss() {
        int bossX = boss.getLocation().getX();
        int playerX = player.getLocation().getX();

        while (Math.abs(bossX - playerX) > 30) {
            Keys direction = bossX < playerX ? Keys.ARROW_LEFT : Keys.ARROW_RIGHT;
            Selenide.actions().sendKeys(player, direction).perform();

            bossX = boss.getLocation().getX();
            playerX = player.getLocation().getX();
        }
    }

    public void attackBoss() {
        while (boss.isDisplayed()) {
            try {
                Selenide.actions().sendKeys(player, Keys.SPACE).perform();
            } catch (Exception e) {
                // Exit loop if boss element is no longer in the DOM
                break;
            }
        }
    }
}








