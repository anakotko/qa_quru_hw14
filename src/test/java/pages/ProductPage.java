package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private SelenideElement headerProductPage=$("[field='tn_text_1542107067012']");


    @Step("Проверка заголовка 'Новый импульс для развития бизнеса' на странице Продукты")
    public ProductPage productPageHeaderCheck(String value){
        headerProductPage.shouldHave(text(value));
        return this;
    }
}
