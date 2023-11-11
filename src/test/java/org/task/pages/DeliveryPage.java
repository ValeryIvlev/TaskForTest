package org.task.pages;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.task.pages.components.ModalComponent;


public class DeliveryPage {
    ModalComponent component = new ModalComponent();
    private final SelenideElement locator = component.modalComponent();

    public ModalComponent clickOpenButton() {
        locator.click();
        return Selenide.page(ModalComponent.class);
    }
}