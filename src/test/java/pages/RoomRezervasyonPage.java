package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Path;

public class RoomRezervasyonPage {

    public RoomRezervasyonPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addRoomReservationButton;

    @FindBy(id ="IDUser")
    public WebElement idUser;

    @FindBy(id ="IDHotelRoom")
    public WebElement IdOtelRoom;

    @FindBy(id ="Price")
    public WebElement idPrice;

    @FindBy(id="DateStart")
    public WebElement dateStart;

    @FindBy(id ="DateEnd")
    public WebElement dateEnd;

    @FindBy(id="AdultAmount")
    public WebElement adltAmount;

    @FindBy(id ="ChildrenAmount")
    public WebElement childrenAmount;

    @FindBy(id = "ContactNameSurname")
    public WebElement contactNameSurname;

    @FindBy(id="ContactPhone")
    public WebElement contactPhone;

    @FindBy(id="ContactEmail")
    public WebElement contactEmail;

    @FindBy(id ="Notes")
    public WebElement notes;

    @FindBy(id="Approved")
    public WebElement approved;

    @FindBy(id="IsPaid")
    public WebElement isPaid;

    @FindBy(id ="btnSubmit")
    public WebElement saveButtont;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessaje;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButton;


}