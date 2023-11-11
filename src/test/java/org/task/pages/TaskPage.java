package org.task.pages;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.task.pages.components.ModalComponent;

public class TaskPage {

    ModalComponent component;

    public TaskPage(ModalComponent component) {
        this.component = component;
    }

    public ModalComponent clickOpenButton() {
        component.clickOpenButton();
        return Selenide.page(ModalComponent.class);
    }

}
