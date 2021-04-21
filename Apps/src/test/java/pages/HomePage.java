package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static setups.DriverPool.getDriverInstance;

public class HomePage {

    private AndroidDriver driver;

    public HomePage(){

    }

    public HomePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(id = "com.example.android.architecture.blueprints.todomvp.mock:id/fab_add_task")
    private AndroidElement addButton;

    @FindBy(id = "com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title")
    private AndroidElement addTitle;

    @FindBy(id = "com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description")
    private AndroidElement addDescription;

    @FindBy(id = "com.example.android.architecture.blueprints.todomvp.mock:id/fab_edit_task_done")
    private AndroidElement doneButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.CheckBox")
    private AndroidElement checked2;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox")
    private AndroidElement checked3;

    @FindBy(id = "com.example.android.architecture.blueprints.todomvp.mock:id/menu_filter")
    private AndroidElement menuFilter;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement Active;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement Completed;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement Active1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView")
    private AndroidElement Active2;

    @FindBy(id = "com.example.android.architecture.blueprints.todomvp.mock:id/title")
    private AndroidElement completed;


    public void tapAddbutton(){
        addButton.isDisplayed();
        addButton.click();
    }

    public void inputTitle(String title){
        addTitle.isDisplayed();
        addTitle.clear();
        addTitle.sendKeys(title);
    }

    public void inputDescription(String description){
        addDescription.isDisplayed();
        addDescription.clear();
        addDescription.sendKeys(description);
    }

    public void tapDonebutton(){
        doneButton.isDisplayed();
        doneButton.click();
    }

    public void tapCheckbox(){
        checked2.isDisplayed();
        checked3.isDisplayed();
        checked2.click();
        checked3.click();
    }

    public void uncheckBox(){
        checked2.click();
    }

    public void verifyActive() {
        menuFilter.click();
        Active.click();
        Assert.assertEquals(Active1.getText(), "Love" );
        System.out.println("The Activated to do is " + Active1.getText());
        Assert.assertEquals(Active2.getText(), "Effort" );
        System.out.println("The Activated to do is " + Active2.getText());
    }

    public void verifyCompleted() {
        menuFilter.click();
        Completed.click();
        Assert.assertEquals(completed.getText(), "Pray");
        System.out.println("The Completed to do is " + completed.getText());
    }

}