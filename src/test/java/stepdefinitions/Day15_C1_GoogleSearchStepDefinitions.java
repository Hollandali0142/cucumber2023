package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day15_C1_GoogleSearchStepDefinitions {

        //Java kodlari step definition kismina gelecek
    GooglePage googlePage =new GooglePage();

    @Given("kullanici google sayfasindadir")
    public void kullanici_google_sayfasindadir() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.getDriver().findElement(By.id("L2AGLb")).click();


    }
    @Given("kullanici iPhone arar")
    public void kullanici_i_phone_arar() {

        googlePage.googleSearchBox.sendKeys("iPhone" + Keys.ENTER);

    }
    @Then("kullanici sonuclarda IPhone oldugunu verify et")
    public void kullanici_sonuclarda_ı_phone_oldugunu_verify_et() {
      boolean title= Driver.getDriver().getPageSource().contains("iPhone");

        Assert.assertTrue(title);


    }
    @Then("kullanici application kapatir")
    public void kullanici_application_kapatir() {

        Driver.closeDriver();

    }

    @Given("kullanici caydanlik arar")
    public void kullanici_caydanlik_arar() {
        googlePage.googleSearchBox.sendKeys("caydanlik"+ Keys.ENTER);

    }
    @Then("kullanici sonuclarda caydanlik oldugunu verify et")
    public void kullanici_sonuclarda_caydanlik_oldugunu_verify_et() {

        String title =Driver.getDriver().getTitle();

        Assert.assertTrue(title.contains("caydanlik"));

        Driver.closeDriver();
    }
    @Given("kullanici cicek'i arar")
    public void kullanici_cicek_i_arar() {
       googlePage.googleSearchBox.sendKeys("cicek"+ Keys.ENTER);
    }
    @Then("kullanici sonuclarda cicek oldugunu verify eder")
    public void kullanici_sonuclarda_cicek_oldugunu_verify_eder() {

       Assert.assertTrue("Cicek", Driver.getDriver().getTitle().contains("cicek"));

       Driver.closeDriver();

    }

}
