package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PartnersPage {
    private SelenideElement headerPartnersPage=$("[field='tn_text_1539595369832']");

    @Step("Проверка заголовка 'Партнерская экосистема' на странице Партнеры")
    public PartnersPage partnersPageHeaderCheck(String value){
        headerPartnersPage.shouldHave(text(value));
        return this;
    }
}
