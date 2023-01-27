package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.LoginPage;
import pages.RoomRezervasyonPage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Day17_C7_Room_Rezervasyon_Step_Definitions {

    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage=new DefaultPage();

    RoomRezervasyonPage roomRezervasyonPage=new RoomRezervasyonPage();

    @Given("kullanici manager kullanici bilgilerini girer")
    public void kullanici_manager_kullanici_bilgilerini_girer(DataTable kullanicibilgileri) {
    /*  1. yol list
        List<String> menajerKullaniciBilgileri=kullanicibilgileri.row(1);
        System.out.println(menajerKullaniciBilgileri);
        System.out.println(menajerKullaniciBilgileri.get(0));
        System.out.println(menajerKullaniciBilgileri.get(1));
        loginPage.username.sendKeys(menajerKullaniciBilgileri.get(0));
        loginPage.password.sendKeys(menajerKullaniciBilgileri.get(1));
   */
        //2. yol datayi List<List<String>> olarak alma

     // List<List<String>> managerBilgileri2 =kullanicibilgileri.asLists();

      /*
        System.out.println(managerBilgileri2);//[[username, password!], [manager, Manager1!]]

        for(List<String>herbirbilgi:managerBilgileri2) {

            System.out.println(herbirbilgi);//[username, password!]
            System.out.println(herbirbilgi.get(0));//username
            System.out.println(herbirbilgi.get(1));//password!

            if (!herbirbilgi.get(0).equals("username")) {
                loginPage.username.sendKeys(herbirbilgi.get(0));
                loginPage.password.sendKeys(herbirbilgi.get(1));


            }

        }
        */

        /*
            //3.yol datayi lambda ile al

        List<List<String>> managerBilgileri2 =kullanicibilgileri.asLists();
        managerBilgileri2.stream().filter(t->!(t.get(0).equals("username"))).forEach(t->{

            loginPage.username.sendKeys(t.get(0));
            loginPage.password.sendKeys(t.get(1));


        });
        */

        //datayi 4. yol List<Map<String, String>> alma

      List<Map<String,String>> manegerBilgi3= kullanicibilgileri.asMaps(String.class,String.class);
        System.out.println(manegerBilgi3);


        for (Map<String, String> herBirBilgi:manegerBilgi3){
            System.out.println(herBirBilgi);
            loginPage.username.sendKeys(herBirBilgi.get("username"));
            loginPage.password.sendKeys(herBirBilgi.get("password"));

        }

    }

    @Given("kullanıcı oda rezervasyon sayfasını yönlendirilir")
    public void kullanıcı_oda_rezervasyon_sayfasını_yönlendirilir() {
            defaultPage.hotelManagementLink.click();
            defaultPage.roomReservationsLink.click();
            roomRezervasyonPage.addRoomReservationButton.click();
    }

    @Given("kullanıcı tüm zorunlu alanları girer")
    public void kullanıcı_tüm_zorunlu_alanları_girer(DataTable roomData) {

        List<String> testData=roomData.row(1);
        System.out.println(testData);//[manager, Harrison, 700, 01/17/2023, 01/30/2023, 2, 4, test, (850) 256-2565, test@gmail.com, bu datatable ile ilk test]

        //idUser bir dropdown

        Select idUser=new Select(roomRezervasyonPage.idUser);
        idUser.selectByVisibleText(testData.get(0));

        //IdOtelRoom bir dropdown

        Select IdOtelRoom=new Select(roomRezervasyonPage.IdOtelRoom);
        IdOtelRoom.selectByVisibleText(testData.get(1));

        roomRezervasyonPage.idPrice.sendKeys(testData.get(2));

        roomRezervasyonPage.dateStart.sendKeys(testData.get(3));

        roomRezervasyonPage.dateEnd.sendKeys(testData.get(4));

        roomRezervasyonPage.adltAmount.sendKeys(testData.get(5));

        roomRezervasyonPage.childrenAmount.sendKeys(testData.get(6));

        roomRezervasyonPage.contactNameSurname.sendKeys(testData.get(7));

        roomRezervasyonPage.contactPhone.sendKeys(testData.get(8));

        roomRezervasyonPage.contactEmail.sendKeys(testData.get(9));

        roomRezervasyonPage.notes.sendKeys(testData.get(10));

    }

    @Given("kullanıcı approved checkbox’a click eder")
    public void kullanıcı_approved_checkbox_a_click_eder() {

        roomRezervasyonPage.approved.click();

    }
    @Given("kullanıcı paid check box’a click eder")
    public void kullanıcı_paid_check_box_a_click_eder() {

        roomRezervasyonPage.isPaid.click();
    }
    @Given("kullanıcı save button’una click eder")
    public void kullanıcı_save_button_una_click_eder() {

        roomRezervasyonPage.saveButtont.click();

    }
        @Then("kullanıcı success mesajını verify eder")
        public void kullanıcı_success_mesajını_verify_eder() throws InterruptedException {

            Thread.sleep(2000);

        Assert.assertEquals("RoomReservation was inserted successfully",roomRezervasyonPage.successMessaje.getText());

        roomRezervasyonPage.okButton.click();

   }



}