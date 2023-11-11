package org.task.pages;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.task.pages.components.ModalComponent;

public class TaskPage {

    ModalComponent component = new ModalComponent();

    public ModalComponent clickOpenButton() {
        component.clickOpenButton();
        return Selenide.page(ModalComponent.class);
    }

}
