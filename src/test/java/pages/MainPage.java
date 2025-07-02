package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalendarComponent;
import pages.components.CheckResultComponent;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class MainPage {

    private SelenideElement companyLogo = $x("//img[contains(@class, 'tn-atom__img')]"),
            productPage = $(".yadro-tab1"),
            partnersPage = $(".yadro-tab3"),
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

    @Step("Устанавливаем значение в поле Last Name")
    public MainPage clickProductPage(String value){
        productPage.shouldHave(text(value));

        return this;
    }

    @Step("Устанавливаем значение в поле Email")
    public MainPage clickPartnersPage(String value){
        partnersPage.setValue(value);

        return this;
    }

    @Step("Устанавливаем значение в поле Gender")
    public MainPage buttonShouldBeVisible(String value){
        checkbutton.shouldHave(text(value)).shouldBe(visible).shouldBe(enabled);

        return this;
    }
}