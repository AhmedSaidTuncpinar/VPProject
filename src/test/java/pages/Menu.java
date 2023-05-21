package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Menu {
    public Menu(){
        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//div[text()='Menu']")
        public WebElement MenuButton;
}
