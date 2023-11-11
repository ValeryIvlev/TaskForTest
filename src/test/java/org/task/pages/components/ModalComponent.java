package org.task.pages.components;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;


public class ModalComponent {

    private final SelenideElement locator = $("");

    public SelenideElement modalComponent(){
        return locator;
    }
    public ModalComponent clickOpenButton() {
        locator.click();
        return Selenide.page(ModalComponent.class);
    }
}
