package com.newVyTrack.pages;

import com.newVyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  abstract class BasePage {

    public BasePage() { PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul")
    public List<WebElement> menuList;

    @FindBy(xpath = "//*[@id=\"sidebar-right\"]/button[2]")
    public WebElement sidebarAdd;



}
