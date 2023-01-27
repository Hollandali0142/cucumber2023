package stepdefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

        //Cucumber da hook clas ne demektir
        //hooks Before ve After annotationlari sahiptir
        //hook bir Scenario dan once (before) veya sonra (After) calisir
        //@After da nelerin var?
        //Cucumber da @after hooks da report ve screetShort alirim
        //Hooks u ben dizayn ederim ve test scenario basarisiz oldugunda  screenShot alirim

    @Before
    public void setUp(){

        System.out.println("Bur bir hooks @Before methodudur");
    }

    @AfterStep
    public void tearDown(Scenario scenario){

        System.out.println("Bu bir hooks @After methoddur");

        //screen almak icin:getScreenshotAs() screenShot alacaktir
//    final byte[]  screenShot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//
//        //screenShot scenario raporuna ekle
//
//        if(scenario.isFailed()) {
//            scenario.attach(screenShot, "image/png", "screenshot");
//
//        }

    }
}
