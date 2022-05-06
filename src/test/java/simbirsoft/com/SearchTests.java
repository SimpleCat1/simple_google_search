package simbirsoft.com;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    private String inputField = "input[name='q']";
    private String setText = "selenide";
    private String lookForTextSelenideOrg = "#search";
    private String TextSelenideOrg = "selenide.org";

    @Test
    void searchGoogle_searchTextSelenide_textSelenideIs() {
        open("https://www.google.com/");
        $(inputField).setValue(setText).pressEnter();
        $(lookForTextSelenideOrg).shouldHave(text(TextSelenideOrg));
    }
}
