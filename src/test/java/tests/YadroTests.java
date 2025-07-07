package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

public class YadroTests extends TestBase {

    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();
    PartnersPage partnersPage = new PartnersPage();
    PartnersButtonPage partnersButtonPage = new PartnersButtonPage();
    ServicePage servicePage = new ServicePage();

        @Test
        @Tag("yadro_test")
        @DisplayName("Проверка отображения логотипа компании")
        void logoShouldBeVisibleTest() {
            mainPage.openPage()
                    .checkLogoIsVisible();
        }

        @Test
        @Tag("yadro_test")
        @DisplayName("Открываем страницу Продукты, отображается строчка 'Новый импульс для развития бизнеса'")
        void productPageTest() {
            mainPage.openPage()
                    .clickProductPage();
            productPage.productPageHeaderCheck("Новый импульс для развития бизнеса");
        }

        @Test
        @Tag("yadro_test")
        @DisplayName("Открываем страницу Партнеры и видим заголовок 'Партнерская экосистема'")
        void partnersPageTest() {
            mainPage.openPage()
                    .clickPartnersPage();
            partnersPage.partnersPageHeaderCheck("Партнерская экосистема");
        }

        @Test
        @Tag("yadro_test")
        @DisplayName("Проверяем наличие кнопки 'Стать партнером'")
        void buttonShouldBeVisibleTest() {
            mainPage.openPage()
                    .clickPartnersPage();
            partnersButtonPage.buttonShouldBeVisible("Стать партнером");
        }

        @Test
        @Tag("yadro_test")
        @DisplayName("Открываем страницу Сервис и видим заголовок 'Программы поддержки'")
        void servicePageTest() {
            mainPage.openPage()
                    .clickServicePage();
            servicePage.servicePageHeaderCheck("Программы поддержки");
        }
    }
