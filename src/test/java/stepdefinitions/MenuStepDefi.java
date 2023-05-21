package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Menu;
import utilities.ConfigReader;
import utilities.Driver;

public class MenuStepDefi {
    Menu menu= new Menu();

    @Given("user is on Veepee page")
    public void userIsOnVeepeePage() {
        Driver.getDriver().get(ConfigReader.getProperty("veepee_url"));
    }

    @And("user clicks Menu icon")
    public void userClicksMenuIcon() {menu.MenuButton.click();
    }
}
