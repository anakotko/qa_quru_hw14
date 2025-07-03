package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class MainPage {

    private SelenideElement companyLogo = $x("//img[contains(@class, 'tn-atom__img')]"),
            productPage = $(".yadro-tab1"),
            headerProductPage=$("[field='tn_text_1542107067012']"),
            partnersPage = $(".yadro-tab3"),
            headerPartnersPage=$("[field='tn_text_1539595369832']"),
            checkbutton = $("a[href='https://partners.yadro.com/?is_partner=true']");

    @Step("Открываем главную страницу")
    public MainPage openPage(){
        open(baseUrl);
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    @Step("Проверка отображения логотипа компании")
    public MainPage checkLogoIsVisible(){
        companyLogo.shouldBe(visible);

        return this;
    }

    @Step("Открываем страницу Продукты")
    public MainPage clickProductPage(){
        productPage.click();

        return this;
    }


    @Step("Проверка заголовка 'Новый импульс для развития бизнеса' на странице Продукты")
    public MainPage productPageHeaderCheck(String value){
        headerProductPage.shouldHave(text(value));

        return this;
    }

    @Step("Открываем страницу Партнеры")
    public MainPage clickPartnersPage(){
        partnersPage.click();

        return this;
    }

    @Step("Проверка заголовка 'Партнерская экосистема' на странице Партнеры")
    public MainPage partnersPageHeaderCheck(String value){
        headerPartnersPage.shouldHave(text(value));

        return this;
    }

    @Step("Проверяем наличие кнопки 'Стать партнером'")
    public MainPage buttonShouldBeVisible(String value){
        checkbutton.shouldHave(text(value)).shouldBe(visible).shouldBe(enabled);

        return this;
    }
}