package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.runner.RunWith;

//@RunWith:Cucumber.class lari calistirmak icin kullanilir, kullanmadan Runner calismaz
@RunWith(Cucumber.class)

//calistirmak istedigim feature file belirtiyorum
// @CucumberOptions() : feature path i eklemek icin kullanilir, step deginitin path, tag, dryRun, report icerir
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },

        //kosacak dosyanin adresi 'path'==>target/failedRerun.txt
        features = "@target/failedRerun.txt",//Zorunludur=>Feature dosyasini pathini girmemiz lazim
        glue ="stepdefinitions",//Zrunludur => Stepdefinition adresi(path)'i
        tags ="@manager_login_test",//hangi feature file kosmali onu belirtiyoruz=>Eger tags kullanmaz isek Runne tum feature calistirir
        dryRun =false//opsiyoneldir false yaparsak tarayici ile calisir

)

public class FailedScenarioRunner {
}
