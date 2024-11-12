import Pages.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class HTF2024Test extends BrowserTest {


    @Test
    public void RunTroughApplication() {

        //TransmissionPage
        new TransmissionPage().clickOnTransMissionButton();

        //Click on the Globe
        $(By.tagName("body")).click();

        new InformationPage()
                .fillInTheInformationForm("Dimitri", 34, "Human", "Earth");

        //Click Continue
        new AbstractDialoguePage().clickOnContinue();


        new DeadBodyPage().clickOnTheYellowPaper();
        List<Integer> code = new DeadBodyPage().saveTheCodeShownOnScreen();
        new DeadBodyPage().clickOnContinueButton();

        new GatePage().clickOnNumpadToEnlargeIt();
        new GatePage().FillInTheCode(code);
        new GatePage().enterTheDarkByPressingArrowUp();

        new AbstractDialoguePage().clickOnContinue();

        new TheLadyPage().clickYesOrNoOnHelpQuestion("Yes");
        new TheLadyPage().clickOnYesOrNoOnLieQuestion("Yes");
        new TheLadyPage().clickOnArrowOnWhatHappend();
        new TheLadyPage().clickOnArrowOnExperimentWentWrong();
        new TheLadyPage().clickOnArrowOnMeteorText();

        new AbstractDialoguePage().clickOnContinue();

        //Meteor
        new MeteorPage().clickOnMeteor();
        new MeteorPage().clickAndHoldScanButton();

        new AbstractDialoguePage().clickOnContinue();

        // test tubes
        new TubePage().setBothValuesEqualAndContinue();

        new AbstractDialoguePage().clickOnContinue();

        //Boss fight ??
        new BossFightPage().movePlayerToBoss();
        new BossFightPage().attackBoss();
    }
}









