package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class Day19_C10_DataTableStepDefinitions {
 DataTablePage dataTablePage = new DataTablePage();

 @Given("kullanici database sayfasindadir")
 public void kullanici_database_sayfasindadir() {

  Driver.getDriver().get(ConfigReader.getProperty("data_olusturma_url"));

 }

 @Given("kullanici new buttona tiklar")
 public void kullanici_new_buttona_tiklar() {

  dataTablePage.newButton.click();
 }

 @When("kullanici firstname {string} girer")
 public void kullanici_firstname_girer(String firstname) {

  dataTablePage.firstName.sendKeys(firstname);

 }

 @When("kullanici lastname {string} girer")
 public void kullanici_lastname_girer(String lastname) {

  dataTablePage.lastName.sendKeys(lastname);

 }

 @When("kullanici position {string} girer")
 public void kullanici_position_girer(String position) {

  dataTablePage.position.sendKeys(position);

 }

 @When("kullanici office {string} girer")
 public void kullanici_office_girer(String office) {

  dataTablePage.office.sendKeys(office);
 }

 @When("kullanici extension {string} girer")
 public void kullanici_extension_girer(String extension) {
  dataTablePage.extension.sendKeys(extension);
 }

 @When("kullanici startdate {string} girer")
 public void kullanici_startdate_girer(String startdate) {

  dataTablePage.startDate.sendKeys(startdate);

 }

 @When("kullanici salary {string} girer")
 public void kullanici_salary_girer(String salary) {
  dataTablePage.salary.sendKeys(salary);

 }

 @When("creat buttuna tikla")
 public void creat_buttuna_tikla() {
  dataTablePage.createButton.click();
 }

 @When("kullanici firstname {string} arayacak")
 public void kullanici_firstname_arayacak(String firstname) {

  dataTablePage.searchBox.sendKeys(firstname);

 }

 @Then("cikan listede  firstname {string} oldugunu verify eder")
 public void cikan_listede_firstname_oldugunu_verify_eder(String firstname) {

  ReusableMethods.waitFor(3);
  Assert.assertTrue(dataTablePage.nameField.getText().contains(firstname));

 }

 //Datayi excelde alma
 @Given("kullanici tum zorunlu alanlari {string} alarak girer")
 public void kullanici_tum_zorunlu_alanlari_alarak_girer(String SheetName) {
  ExcelUtil excelUtil=new ExcelUtil("src/test/resources/testdata/data_tables_workbook.xlsx",SheetName);
   List<Map<String,String>> testData=excelUtil.getDataList();

     for (Map<String,String> herBirData : testData){

      Driver.getDriver().get(ConfigReader.getProperty("data_olusturma_url"));

      dataTablePage.newButton.click();
      dataTablePage.firstName.sendKeys(herBirData.get("firstname"));
      dataTablePage.lastName.sendKeys(herBirData.get("lastname"));
      dataTablePage.position.sendKeys(herBirData.get("position"));
      dataTablePage.office.sendKeys(herBirData.get("office"));
      dataTablePage.extension.sendKeys(herBirData.get("extension"));
     // dataTablePage.startDate.sendKeys(herBirData.get("startdate"));
      dataTablePage.startDate.click();
      ReusableMethods.waitFor(1);
      dataTablePage.tarihSecme.click();
      ReusableMethods.waitFor(1);
      dataTablePage.salary.sendKeys(herBirData.get("salary"));
      dataTablePage.createButton.click();
      ReusableMethods.waitFor(1);
       dataTablePage.searchBox.sendKeys(herBirData.get("firstname"));
      ReusableMethods.waitFor(1);
      Assert.assertTrue(dataTablePage.nameField.getText().contains(herBirData.get("firstname")));


     }

 }
}