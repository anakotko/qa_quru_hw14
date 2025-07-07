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
            partnersPage = $(".yadro-tab3"),
//            servicePage = $("a[href='https://sp.yadro.com']").shouldHave(text("Сервис"));
                servicePage = $(".yadro-tab4");

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

    @Step("Открываем страницу Партнеры")
    public MainPage clickPartnersPage(){
        partnersPage.click();

        return this;
    }

    @Step("Открываем страницу Сервис")
    public MainPage clickServicePage(){
        servicePage.click();

        return this;
    }
}