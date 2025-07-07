package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PartnersButtonPage {
    private SelenideElement checkbutton = $("a[href='https://partners.yadro.com/?is_partner=true']");


    @Step("Проверяем наличие кнопки 'Стать партнером'")
    public PartnersButtonPage buttonShouldBeVisible(String value){
        checkbutton.shouldHave(text(value)).shouldBe(visible).shouldBe(enabled);

        return this;
    }
}
