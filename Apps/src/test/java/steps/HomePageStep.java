package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import static setups.DriverPool.getDriverInstance;

public class HomePageStep {

    HomePage homePage = new HomePage(getDriverInstance());

    @Given("^User launch the aut$")
    public void userLaunchTheAut() throws Throwable {

    }

    @When("^Create To-Do with title and description$")
    public void userAddTitleAndDescription() throws Throwable {
        homePage.tapAddbutton();
        Thread.sleep(3000);
        homePage.inputTitle("Love");
        homePage.inputDescription("Love is part of life");
        homePage.tapDonebutton();
        homePage.tapAddbutton();
        homePage.inputTitle("Effort");
        homePage.inputDescription("Effort is part of success");
        homePage.tapDonebutton();
        homePage.tapAddbutton();
        homePage.inputTitle("Pray");
        homePage.inputDescription("Prayer is good for yourself");
        homePage.tapDonebutton();
        Thread.sleep(3000);
    }

    @Then("^Complete/Check To-Do with title “effort” and “Pray”$")
    public void completeCheckToDoWithTitleEffortAndPray() throws Throwable{
        homePage.tapCheckbox();
        Thread.sleep(3000);
    }

    @Then("^Uncheck To-Do “effort”$")
    public void uncheckToDoEffort() throws Throwable{
        homePage.uncheckBox();
        Thread.sleep(3000);
    }

    @Then("^Filter To-Do for “Active” only and verify it$")
    public void filterToDoForActiveOnlyAndVerifyIt() throws Throwable{
        homePage.verifyActive();
        Thread.sleep(3000);
    }

    @Then("^Filter To-Do for “Complete” only and verify it$")
    public void filterToDoForCompleteOnlyAndVerifyIt() throws Throwable {
        homePage.verifyCompleted();
        Thread.sleep(3000);
    }
}