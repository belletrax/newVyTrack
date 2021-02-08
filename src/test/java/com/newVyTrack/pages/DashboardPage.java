package com.newVyTrack.pages;

import com.newVyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() { PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath ="//*[@id=\"main-menu\"]/ul/li[1]/a/span" )
    public WebElement fleetModule;


}
